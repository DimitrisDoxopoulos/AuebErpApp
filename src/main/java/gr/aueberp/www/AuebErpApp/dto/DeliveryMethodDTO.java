package gr.aueberp.www.AuebErpApp.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DeliveryMethodDTO {
    private Long id;
    private String methodName;
    private Double amount;
}
