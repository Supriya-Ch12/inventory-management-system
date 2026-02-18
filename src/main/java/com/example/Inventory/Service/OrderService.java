package com.example.Inventory.Service;


        import com.example.Inventory.model.Order;
        import com.example.Inventory.model.Product;
        import com.example.Inventory.Repository.OrderRepository;
        import lombok.RequiredArgsConstructor;
        import org.springframework.stereotype.Service;
        import org.springframework.transaction.annotation.Transactional;
        import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class OrderService {
    private final OrderRepository orderRepository;
    private final ProductService productService;

    @Transactional
    public Order placeOrder(Order order) {
        // 1. Get the product details
        Product product = productService.getProductById(order.getProduct().getId());

        // 2. Check if enough stock is available
        if (product.getStockQuantity() < order.getQuantity()) {
            throw new RuntimeException("Insufficient stock for product: " + product.getName());
        }

        // 3. Calculate total amount
        order.setTotalAmount(product.getPrice() * order.getQuantity());
        order.setOrderDate(LocalDateTime.now());
        order.setStatus("PLACED");

        // 4. Update the inventory stock
        productService.updateStock(product.getId(), order.getQuantity());

        // 5. Save and return the order
        return orderRepository.save(order);
    }
}

