package gr.aueberp.www.AuebErpApp.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "payment_methods")
public class PaymentMethod {
    @Id
    private Long id;

    @Column(name = "method_name")
    private String methodName;
}
