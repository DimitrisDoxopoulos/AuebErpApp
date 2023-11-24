package gr.aueberp.www.AuebErpApp.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "billing_address")
public class BillingAddress {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToOne
    @JoinColumn(name = "customer_id", nullable = false)
    private Customer customer;

    @Column(name = "street_name", length = 50)
    private String streetName;

    @Column(name = "city_name", length = 50)
    private String cityName;

    @Column(name = "postal_code", length = 50)
    private String postalCode;

    @Column(name = "country", length = 50)
    private String country;
}
