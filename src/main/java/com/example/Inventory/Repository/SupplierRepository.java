package com.example.Inventory.Repository;

        import com.example.Inventory.model.Supplier;
        import org.springframework.data.jpa.repository.JpaRepository;
        import org.springframework.stereotype.Repository;

@Repository
public interface SupplierRepository extends JpaRepository<Supplier, Long> {
    // Find a supplier by their company name
    Supplier findBySupplierName(String supplierName);
}

