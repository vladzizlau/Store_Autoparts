package by.pvt.core.repository;

import by.pvt.api.dto.shopDTO.OrderResponse;
import by.pvt.core.domain.Order;
import by.pvt.core.domain.StatusOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface OrderRepo extends JpaRepository<Order, Long> {
    @Query(value = "select o from Order o where o.user.id = :id")
    List<Order> getAllByUser(@Param("id") Long id);

    @Query(value = "select o from Order o where o.user.id = :id and o.status = :stat")
    List<Order> getOrderUserByStatus(@Param("id") Long id, @Param("stat")StatusOrder so);
}
