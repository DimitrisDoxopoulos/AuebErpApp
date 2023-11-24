package gr.aueberp.www.AuebErpApp.service.interfaces;

import gr.aueberp.www.AuebErpApp.dto.BillingAddressInsertDTO;
import gr.aueberp.www.AuebErpApp.dto.BillingAddressUpdateDTO;
import gr.aueberp.www.AuebErpApp.dto.DeliveryAddressDTO;
import gr.aueberp.www.AuebErpApp.errors.DeliveryAddressDoesNotExistException;

import java.util.List;

public interface IDeliveryAddressService {
    DeliveryAddressDTO insertDeliveryAddress(BillingAddressInsertDTO billingAddressInsertDTO);
    DeliveryAddressDTO updateDeliveryAddress(BillingAddressUpdateDTO billingAddressUpdateDTO);
    DeliveryAddressDTO getDeliveryAddressById(Long id) throws DeliveryAddressDoesNotExistException;
    boolean deleteDeliveryAddress(Long id) throws DeliveryAddressDoesNotExistException;
    List<DeliveryAddressDTO> getAllDeliveryAddresses();
}
