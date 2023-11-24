package gr.aueberp.www.AuebErpApp.service.interfaces;

import gr.aueberp.www.AuebErpApp.dto.BillingAddressDTO;
import gr.aueberp.www.AuebErpApp.dto.BillingAddressInsertDTO;
import gr.aueberp.www.AuebErpApp.dto.BillingAddressUpdateDTO;
import gr.aueberp.www.AuebErpApp.errors.BillingAddressDoesNotExistException;

import java.util.List;

public interface IBillingAddressService {
    BillingAddressDTO insertBillingAddress(BillingAddressInsertDTO billingAddressInsertDTO);
    BillingAddressDTO updateBillingAddress(BillingAddressUpdateDTO billingAddressUpdateDTO);
    BillingAddressDTO getBillingAddressById(Long id) throws BillingAddressDoesNotExistException;
    boolean deleteBillingAddress(Long id) throws BillingAddressDoesNotExistException;
    List<BillingAddressDTO> getAllBillingAddresses();
}
