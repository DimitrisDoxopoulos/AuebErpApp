package gr.aueberp.www.AuebErpApp.repositories;

import gr.aueberp.www.AuebErpApp.models.Customer;
import gr.aueberp.www.AuebErpApp.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.Optional;

public interface CustomerRepository extends JpaRepository<Customer, Long>, JpaSpecificationExecutor<Product> {
    Optional<Customer> findCustomerByEmail(String email);
}
