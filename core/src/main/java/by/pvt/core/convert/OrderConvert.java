package by.pvt.core.convert;

import by.pvt.api.dto.shopDTO.OrderRequest;
import by.pvt.api.dto.shopDTO.OrderResponse;
import by.pvt.core.domain.Order;

public class OrderConvert {
    public Order toEntity(OrderRequest orderRequest) {
        Order order = Order.builder()
                .id(orderRequest.getId())
                .cost(orderRequest.getCost())
                .build();

        return order;
    }

    public OrderResponse toDTO(Order order) {
        OrderResponse dto = OrderResponse.builder()
                .id(order.getId())
                .cost(order.getCost())
                .build();

        return dto;
    }
}
