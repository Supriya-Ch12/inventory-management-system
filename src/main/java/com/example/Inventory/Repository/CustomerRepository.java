package com.example.Inventory.Repository;

import com.example.Inventory.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
    // Find a customer by their unique email address
    Optional<Customer> findByEmail(String email);
}
