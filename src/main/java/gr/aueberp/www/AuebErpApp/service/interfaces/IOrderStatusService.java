package gr.aueberp.www.AuebErpApp.service.interfaces;

import gr.aueberp.www.AuebErpApp.dto.OrderStatusDTO;
import gr.aueberp.www.AuebErpApp.dto.OrderStatusInsertDTO;
import gr.aueberp.www.AuebErpApp.dto.OrderStatusUpdateDTO;
import gr.aueberp.www.AuebErpApp.errors.OrderStatusAlreadyExistsException;
import gr.aueberp.www.AuebErpApp.errors.OrderStatusDoesNotExistException;

import java.util.List;

public interface IOrderStatusService {
    OrderStatusDTO insertOrderStatus(OrderStatusInsertDTO orderStatusInsertDTO) throws OrderStatusAlreadyExistsException;
    OrderStatusDTO updateOrderStatus(OrderStatusUpdateDTO orderStatusUpdateDTO) throws OrderStatusDoesNotExistException;
    OrderStatusDTO getOrderStatusById(Long id) throws OrderStatusDoesNotExistException;
    boolean deleteOrderStatus(Long id) throws OrderStatusDoesNotExistException;
    List<OrderStatusDTO> getAllOrderStatuses();
}
