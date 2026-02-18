
package com.example.Inventory.Controller;
        import com.example.Inventory.model.Order;
        import com.example.Inventory.Service.OrderService;
        import lombok.RequiredArgsConstructor;
        import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/api/orders")
@RequiredArgsConstructor
public class OrderController {
    private final OrderService orderService;
    @PostMapping
    public Order createOrder(@RequestBody Order order) {
        return orderService.placeOrder(order);
    }
}



