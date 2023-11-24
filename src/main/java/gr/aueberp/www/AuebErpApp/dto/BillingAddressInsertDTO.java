package gr.aueberp.www.AuebErpApp.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class BillingAddressInsertDTO {
    private CustomerDTO customerDTO;
    private String streetName;
    private String cityName;
    private String postalCode;
    private String country;
}
