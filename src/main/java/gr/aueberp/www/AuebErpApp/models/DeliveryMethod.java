package gr.aueberp.www.AuebErpApp.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "delivery_method")
public class DeliveryMethod {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "method_name")
    private String methodName;

    @Column(name = "price")
    private Double amount;
}
