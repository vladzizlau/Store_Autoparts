package by.pvt.core.convert;

import by.pvt.api.dto.shopDTO.ShopcartRequest;
import by.pvt.api.dto.shopDTO.ShopcartResponse;
import by.pvt.core.domain.Shopcart;

public class ShopcartConvert {
    public Shopcart shopcartToEntity(ShopcartRequest scr) {
        Shopcart entity = Shopcart.builder()
                .id(scr.getId())
//                .orderId(scr.getOrderId())
                .cost(scr.getCost())
                .status(scr.getStatus())
                .build();

        return entity;
    }

    public ShopcartResponse toDTO(Shopcart shopcart) {
        ShopcartResponse dto = ShopcartResponse.builder()
                .id(shopcart.getId())
//                .orderId(shopcart.getOrderId())
                .cost(shopcart.getCost())
                .status(shopcart.getStatus())
                .build();
        return dto;
    }

}
