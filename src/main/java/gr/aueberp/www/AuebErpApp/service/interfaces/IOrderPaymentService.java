package gr.aueberp.www.AuebErpApp.service.interfaces;

import gr.aueberp.www.AuebErpApp.dto.OrderPaymentDTO;
import gr.aueberp.www.AuebErpApp.dto.OrderPaymentInsertDTO;
import gr.aueberp.www.AuebErpApp.dto.OrderPaymentUpdateDTO;
import gr.aueberp.www.AuebErpApp.errors.OrderPaymentAlreadyExistsException;
import gr.aueberp.www.AuebErpApp.errors.OrderPaymentDoesNotExistException;

import java.util.List;

public interface IOrderPaymentService {
    OrderPaymentDTO insertOrderPayment(OrderPaymentInsertDTO orderPaymentInsertDTO) throws OrderPaymentAlreadyExistsException;
    OrderPaymentDTO updateOrderPayment(OrderPaymentUpdateDTO orderPaymentUpdateDTO) throws OrderPaymentDoesNotExistException;
    OrderPaymentDTO getOrderPaymentById(Long id) throws OrderPaymentDoesNotExistException;
    boolean deleteOrderPayment(Long id) throws OrderPaymentDoesNotExistException;
    List<OrderPaymentDTO> getAllOrderPayments();
}
