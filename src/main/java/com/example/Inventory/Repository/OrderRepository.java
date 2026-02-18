package com.example.Inventory.Repository;

        import com.example.Inventory.model.Order;
        import org.springframework.data.jpa.repository.JpaRepository;
        import org.springframework.stereotype.Repository;
        import java.util.List;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
    // Find all orders placed by a specific customer
    List<Order> findByCustomerId(Long customerId);

}
