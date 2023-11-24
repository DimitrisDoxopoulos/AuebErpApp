package gr.aueberp.www.AuebErpApp.repositories;

import gr.aueberp.www.AuebErpApp.models.DeliveryMethod;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeliveryMethodRepository extends JpaRepository<DeliveryMethod, Long> {
}
