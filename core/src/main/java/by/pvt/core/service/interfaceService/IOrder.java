package by.pvt.core.service.interfaceService;

import by.pvt.api.dto.shopDTO.OrderRequest;
import by.pvt.api.dto.shopDTO.OrderResponse;
import by.pvt.core.domain.Order;

import java.time.LocalDate;
import java.util.List;

public interface IOrder {
    void add(OrderRequest order);

    List<OrderResponse> getAll();

    OrderResponse searchById(long Id);

    void delete(Order order);

    void edit(OrderRequest order);
}
