package gr.aueberp.www.AuebErpApp.repositories;

import gr.aueberp.www.AuebErpApp.models.DeliveryAddress;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeliveryAddressRepository extends JpaRepository<DeliveryAddress, Long> {
}
