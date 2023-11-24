package gr.aueberp.www.AuebErpApp.service.interfaces;

import gr.aueberp.www.AuebErpApp.dto.PaymentMethodDTO;
import gr.aueberp.www.AuebErpApp.dto.PaymentMethodInsertDTO;
import gr.aueberp.www.AuebErpApp.dto.PaymentMethodUpdateDTO;
import gr.aueberp.www.AuebErpApp.errors.PaymentMethodAlreadyExistsException;
import gr.aueberp.www.AuebErpApp.errors.PaymentMethodDoesNotExistException;

import java.util.List;

public interface IPaymentMethodService {
    PaymentMethodDTO insertPaymentMethod(PaymentMethodInsertDTO paymentMethodInsertDTO) throws PaymentMethodAlreadyExistsException;
    PaymentMethodDTO updatePaymentMethod(PaymentMethodUpdateDTO paymentMethodUpdateDTO) throws PaymentMethodDoesNotExistException;
    PaymentMethodDTO getPaymentMethodById(Long id) throws PaymentMethodAlreadyExistsException;
    boolean deletePaymentMethod(Long id) throws PaymentMethodDoesNotExistException;
    List<PaymentMethodDTO> getAllPaymentMethods();
}
