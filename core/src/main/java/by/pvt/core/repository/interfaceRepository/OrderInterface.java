package by.pvt.core.repository.interfaceRepository;

import by.pvt.api.dto.shopDTO.OrderResponse;
import by.pvt.core.domain.Order;

import java.util.List;

public interface OrderInterface {

    void addOrder(Order order);

    List<OrderResponse> getAllOrder();

    OrderResponse findById(Long orderID);

    void updateOrder(Order order);

    void delOrder(Order order);
}
