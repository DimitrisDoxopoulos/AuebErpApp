package gr.aueberp.www.AuebErpApp.repositories;

import gr.aueberp.www.AuebErpApp.models.BillingAddress;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BillingAddressRepository extends JpaRepository<BillingAddress, Long> {
}
