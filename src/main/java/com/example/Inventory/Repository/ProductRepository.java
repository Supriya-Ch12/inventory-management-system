
package com.example.Inventory.Repository;

        import com.example.Inventory.model.Product;
        import org.springframework.data.jpa.repository.JpaRepository;
        import org.springframework.stereotype.Repository;
        import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    // Custom query to find products with stock levels below a certain threshold
    List<Product> findByStockQuantityLessThan(Integer threshold);
}