package by.pvt.core.service.shopService;

import by.pvt.api.dto.shopDTO.OrderRequest;
import by.pvt.api.dto.shopDTO.OrderResponse;
import by.pvt.core.convert.OrderConvert;
import by.pvt.core.domain.Order;
import by.pvt.core.repository.OrderRepository;
import by.pvt.core.service.interfaceService.IOrder;

import java.util.Collections;
import java.util.List;

public class OrderService implements IOrder {
    OrderRepository orderRepository;
    OrderConvert orderConvert;

    public OrderService() {
        orderRepository = new OrderRepository();
        orderConvert = new OrderConvert();
    }

    @Override
    public void add(OrderRequest order) {
        orderRepository.addOrder(orderConvert.toEntity(order));
    }

    @Override
    public List<OrderResponse> getAll() {
        return orderRepository.getAllOrder();
    }

    @Override
    public OrderResponse searchById(long Id) {
        return orderRepository.findById(Id);
    }

    @Override
    public void delete(Order order) {
        orderRepository.delOrder(order);
    }

    @Override
    public void edit(OrderRequest ord) {
        Order order = orderConvert.toEntity(ord);
        order.setProductid(ord.getProductid());
        order.setUserid(ord.getUserid());
        order.setCount(ord.getCount());
        order.setCost(ord.getCost());
        orderRepository.updateOrder(order);
    }
}
