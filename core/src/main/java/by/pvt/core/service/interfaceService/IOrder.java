package by.pvt.core.service.interfaceService;

import by.pvt.api.dto.shopDTO.OrderRequest;
import by.pvt.core.domain.Order;

import java.time.LocalDate;
import java.util.List;

public interface IOrder
    {
    void add(OrderRequest order);

    List<Order> getAll();

    Order searchById(long Id);

    void delete(Order order);

    void edit(OrderRequest order, long productid, long userid, double cost, int count);
}
