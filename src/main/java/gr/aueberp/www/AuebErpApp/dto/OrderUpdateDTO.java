package gr.aueberp.www.AuebErpApp.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class OrderUpdateDTO {
    private Long id;
    private CustomerDTO customerDTO;
    private BillingAddressDTO billingAddressDTO;
    private DeliveryAddressDTO deliveryAddressDTO;
    private float amount;
    private OrderStatusDTO orderStatusDTO;
    private LocalDateTime created_at;
    private LocalDateTime updated_at;
}
