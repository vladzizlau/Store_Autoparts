package by.pvt.core.convert;

import by.pvt.api.dto.shopDTO.OrderRequest;
import by.pvt.api.dto.shopDTO.OrderResponse;
import by.pvt.core.domain.Order;

public class OrderConvert {
    public Order toEntity(OrderRequest orderRequest) {
        Order order = Order.builder()
                .id(orderRequest.getId())
                .userid(orderRequest.getUserid())
                .productid(orderRequest.getProductid())
                .count(orderRequest.getCount())
                .cost(orderRequest.getCost())
                .build();

        return order;
    }

    public OrderResponse toDTO(Order order) {
        OrderResponse dto = OrderResponse.builder()
                .id(order.getId())
                .userid(order.getUserid())
                .productid(order.getProductid())
                .count(order.getCount())
                .cost(order.getCost())
                .build();

        return dto;
    }
}
