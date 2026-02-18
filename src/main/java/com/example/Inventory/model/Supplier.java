package com.example.Inventory.model;

        import jakarta.persistence.*;
        import lombok.*;
        import java.util.List;

@Entity
@Table(name = "suppliers")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Supplier {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String supplierName;

    private String contactEmail;

    @OneToMany(mappedBy = "supplier")
    private List<Product> products;
}