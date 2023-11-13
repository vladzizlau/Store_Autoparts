package by.pvt.core.repository;

import by.pvt.core.domain.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepo extends JpaRepository<Order, Long> {


}
