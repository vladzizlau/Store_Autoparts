package by.pvt.core.mapper;

import by.pvt.api.dto.shopDTO.OrderRequest;
import by.pvt.api.dto.shopDTO.OrderResponse;
import by.pvt.core.domain.Order;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface OrderMapper {
    @Mapping(target = "userId", source = "user.id")
    OrderResponse toResponse(Order order);


    @Mapping(target = "user.id", source = "userid")
    Order toEntity(OrderRequest request);


    List<OrderResponse> toResponseList(List<Order> orderList);
}
