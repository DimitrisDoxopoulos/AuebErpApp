package gr.aueberp.www.AuebErpApp.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "products")
public class Product {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "ssn", nullable = false, unique = true)
    private String ssn;

    @Column(name = "product_name")
    private String productName;

    @Column(name = "stock")
    private int stock;

    @Column(name = "price")
    private int price;
}
