package gr.aueberp.www.AuebErpApp.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "deliveryAddress")
public class DeliveryAddress {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "string_name", length = 50)
    private String streetName;

    @Column(name = "city_name", length = 50)
    private String cityName;

    @Column(name = "postal_code", length = 50)
    private String postalCode;

    @Column(name = "country", length = 50)
    private String country;
}
