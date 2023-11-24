package gr.aueberp.www.AuebErpApp.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class BillingAddressUpdateDTO {
    private Long id;
    private CustomerDTO customerDTO;
    private String streetName;
    private String cityName;
    private String postalCode;
    private String country;
}
