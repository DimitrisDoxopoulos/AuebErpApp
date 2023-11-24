package gr.aueberp.www.AuebErpApp.service.interfaces;

import gr.aueberp.www.AuebErpApp.dto.CustomerDTO;
import gr.aueberp.www.AuebErpApp.dto.CustomerInsertDTO;
import gr.aueberp.www.AuebErpApp.dto.CustomerUpdateDTO;
import gr.aueberp.www.AuebErpApp.errors.CustomerAlreadyExistsException;
import gr.aueberp.www.AuebErpApp.errors.CustomerDoesNotExistException;

import java.util.List;

public interface ICustomerService {
    CustomerDTO insertCustomer(CustomerInsertDTO customerInsertDTO) throws CustomerAlreadyExistsException;
    CustomerDTO getCustomer(CustomerUpdateDTO customerUpdateDTO) throws CustomerDoesNotExistException;
    CustomerDTO updateCustomer(CustomerDTO customerDTO) throws CustomerDoesNotExistException;
    boolean deleteCustomer(Long id) throws CustomerDoesNotExistException;
    List<CustomerDTO> getAllCustomers();
}
