package gr.aueberp.www.AuebErpApp.service.interfaces;

import gr.aueberp.www.AuebErpApp.dto.DeliveryMethodDTO;
import gr.aueberp.www.AuebErpApp.dto.DeliveryMethodInsertDTO;
import gr.aueberp.www.AuebErpApp.dto.DeliveryMethodUpdateDTO;
import gr.aueberp.www.AuebErpApp.errors.DeliveryMethodAlreadyExistsException;
import gr.aueberp.www.AuebErpApp.errors.DeliveryMethodDoesNotExistException;

import java.util.List;

public interface IDeliveryMethodService {
    DeliveryMethodDTO insertDeliveryMethod(DeliveryMethodInsertDTO deliveryMethodInsertDTO) throws DeliveryMethodAlreadyExistsException;
    DeliveryMethodDTO updateDeliveryMethod(DeliveryMethodUpdateDTO deliveryMethodUpdateDTO) throws DeliveryMethodDoesNotExistException;
    DeliveryMethodDTO getDeliveryMethod(Long id) throws DeliveryMethodDoesNotExistException;
    List<DeliveryMethodDTO> getAllDeliveryMethods();
}
