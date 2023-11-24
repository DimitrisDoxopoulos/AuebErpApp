package gr.aueberp.www.AuebErpApp.service.interfaces;

import gr.aueberp.www.AuebErpApp.dto.ProductDTO;
import gr.aueberp.www.AuebErpApp.dto.ProductInsertDTO;
import gr.aueberp.www.AuebErpApp.dto.ProductUpdateDTO;
import gr.aueberp.www.AuebErpApp.errors.ProductAlreadyExistsException;
import gr.aueberp.www.AuebErpApp.errors.ProductDoesNotExistException;
import gr.aueberp.www.AuebErpApp.errors.ProductSsnAlreadyExistsException;

import java.util.List;

public interface IProductService {
    ProductDTO insertProduct(ProductInsertDTO productInsertDTO) throws ProductAlreadyExistsException;
    ProductDTO updateProduct(ProductUpdateDTO productUpdateDTO) throws ProductDoesNotExistException, ProductSsnAlreadyExistsException;
    ProductDTO getProductById(Long id) throws ProductDoesNotExistException;
    ProductDTO getProductBySsn(String ssn) throws ProductDoesNotExistException;
    boolean deleteProduct(Long id) throws ProductDoesNotExistException;
    List<ProductDTO> getAllProducts();
}
