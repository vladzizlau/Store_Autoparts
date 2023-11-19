package by.pvt.core.service.interfaceService;

import by.pvt.api.dto.shopDTO.OrderRequest;
import by.pvt.api.dto.shopDTO.OrderResponse;
import by.pvt.core.domain.Order;
import by.pvt.core.domain.StatusOrder;

import java.time.LocalDate;
import java.util.List;

public interface IOrder {
    OrderResponse add(long id);

    List<OrderResponse> getAll();

    OrderResponse searchById(long Id);

    void delete(Long id);

    Long edit(OrderRequest order);

    // Ищем все ордеры пользователя
    List<OrderResponse> getOrderByUserId(Long id);

    // Ищем ордеры пользователя по статусу
    List<OrderResponse> getUserOrderByStatus(Long id, StatusOrder so);
}
