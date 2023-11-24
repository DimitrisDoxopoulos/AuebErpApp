package gr.aueberp.www.AuebErpApp.repositories;

import gr.aueberp.www.AuebErpApp.models.OrderPayment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderPaymentRepository extends JpaRepository<OrderPayment, Long> {
}
