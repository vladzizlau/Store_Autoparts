package by.pvt.core.service.shopService;

import by.pvt.api.dto.shopDTO.OrderRequest;
import by.pvt.api.dto.shopDTO.OrderResponse;
import by.pvt.core.domain.Order;
import by.pvt.core.domain.StatusOrder;
import by.pvt.core.domain.User;
import by.pvt.core.mapper.OrderMapper;
import by.pvt.core.mapper.UserMapper;
import by.pvt.core.repository.OrderRepo;
import by.pvt.core.service.interfaceService.IOrder;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class OrderService implements IOrder {
    private OrderRepo orderRepository;
    private OrderMapper orderMapper;
    private UserService userService;
    private UserMapper userMapper;

    @Autowired
    public OrderService(OrderRepo orderRepository, OrderMapper orderMapper, UserService userService, UserMapper userMapper) {
        this.orderRepository = orderRepository;
        this.orderMapper = orderMapper;
        this.userService = userService;
        this.userMapper = userMapper;
    }

    @Override
    public OrderResponse add(long userId) {
        User user = userService.getUserById(userId);
        Order order = new Order();
        order.setStatus(StatusOrder.НЕ_ВЫПОЛНЕН);
        order.setUser(user);
        return orderMapper.toResponse(orderRepository.save(order));
    }

    @Override
    public List<OrderResponse> getAll() {
        return orderMapper.toResponseList(orderRepository.findAll());
    }

    @Override
    public OrderResponse searchById(long id) {
        Optional<Order> byId = orderRepository.findById(id);
        return orderMapper.toResponse(byId.get());
    }

    @Override
    public void delete(Long id) {
        orderRepository.deleteById(id);
    }

    @Override
    public Long edit(OrderRequest ord) {
       return orderRepository.save(orderMapper.toEntity(ord)).getId();
    }


    // Ищем все ордеры пользователя
    @Override
    public List<OrderResponse> getOrderByUserId(Long id) {
        return orderMapper.toResponseList(orderRepository.getAllByUser(id));
    }

    // Ищем ордеры пользователя по статусу
    @Override
    public List<OrderResponse> getUserOrderByStatus(Long userid, StatusOrder so) {
        return orderMapper.toResponseList(orderRepository.getOrderUserByStatus(userid, so));
    }

    private Order findOrder(Long id) {
        return orderRepository.findById(id).get();
    }

    //Ищем один единственный ордер со статусом "Не выполнен" и если нет, то создаем новый
    public Order getThisWorkingOrder(Long userid) {
        List<OrderResponse> list = getUserOrderByStatus(userid, StatusOrder.НЕ_ВЫПОЛНЕН);
        if (!list.isEmpty()) {
            return findOrder(list.get(0).getId());
        }
        return findOrder(add(userid).getId());
    }


}