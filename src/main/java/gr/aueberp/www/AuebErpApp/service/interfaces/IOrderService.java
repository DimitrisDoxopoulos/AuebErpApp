package gr.aueberp.www.AuebErpApp.service.interfaces;

import gr.aueberp.www.AuebErpApp.dto.OrderDTO;
import gr.aueberp.www.AuebErpApp.dto.OrderInsertDTO;
import gr.aueberp.www.AuebErpApp.dto.OrderUpdateDTO;
import gr.aueberp.www.AuebErpApp.errors.OrderAlreadyExistsException;
import gr.aueberp.www.AuebErpApp.errors.OrderDoesNotExistException;

import java.util.List;

public interface IOrderService {
    OrderDTO insertOrder(OrderInsertDTO orderInsertDTO) throws OrderAlreadyExistsException;
    OrderDTO findOrderById(Long id) throws OrderDoesNotExistException;
    OrderDTO findOrderBySsn(String ssn) throws OrderDoesNotExistException;
    OrderDTO updateOrder(OrderUpdateDTO orderUpdateDTO) throws OrderDoesNotExistException;
    boolean deleteOrder(Long id) throws OrderDoesNotExistException;
    List<OrderDTO> getAllOrders();
}
