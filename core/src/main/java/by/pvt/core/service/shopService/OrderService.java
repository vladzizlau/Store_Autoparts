package by.pvt.core.service.shopService;

import by.pvt.api.dto.shopDTO.OrderRequest;
import by.pvt.api.dto.shopDTO.OrderResponse;
import by.pvt.core.convert.OrderConvert;
import by.pvt.core.domain.Order;
import by.pvt.core.mapper.OrderMapper;
import by.pvt.core.repository.OrderRepository;
import by.pvt.core.service.interfaceService.IOrder;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
@Service
public class OrderService implements IOrder {
    private OrderRepository orderRepository;
    private OrderMapper orderMapper;

    public OrderService(OrderRepository orderRepo) {
        orderRepository = orderRepo;
    }

    @Override
    public void add(OrderRequest order) {
        orderRepository.addOrder(orderMapper.toEntity(order));
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
        Order order = orderMapper.toEntity(ord);
        order.setCost(ord.getCost());
        orderRepository.updateOrder(order);
    }
}
