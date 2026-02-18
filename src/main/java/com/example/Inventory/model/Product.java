package com.example.Inventory.model;

        import jakarta.persistence.*;
        import lombok.*;

@Entity
@Table(name = "products")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    private String description;

    @Column(nullable = false)
    private Integer stockQuantity;

    @Column(nullable = false)
    private Double price;

    @ManyToOne
    @JoinColumn(name = "supplier_id")
    private Supplier supplier;
}
