package by.pvt.core.service.shopService;

import by.pvt.api.dto.shopDTO.OrderRequest;
import by.pvt.api.dto.shopDTO.OrderResponse;
import by.pvt.core.domain.Order;
import by.pvt.core.mapper.OrderMapper;
import by.pvt.core.repository.OrderRepo;
import by.pvt.core.service.interfaceService.IOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService implements IOrder {
    @Autowired
    private OrderRepo orderRepository;
    @Autowired
    private OrderMapper orderMapper;


    @Override
    public void add(OrderRequest order) {
        orderRepository.save(orderMapper.toEntity(order));
    }

    @Override
    public List<OrderResponse> getAll() {
        return orderMapper.toResponseList(orderRepository.findAll());
    }

    @Override
    public OrderResponse searchById(long Id) {
        Optional<Order> byId = orderRepository.findById(Id);
        return orderMapper.toResponse(byId.get());
    }

    @Override
    public void delete(Order order) {
        orderRepository.delete(order);
    }

    @Override
    public void edit(OrderRequest ord) {
        Order order = orderMapper.toEntity(ord);
        order.setCost(ord.getCost());
        orderRepository.save(order);
    }
}
