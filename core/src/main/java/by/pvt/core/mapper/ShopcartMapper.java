package by.pvt.core.mapper;

import by.pvt.api.dto.shopDTO.ShopcartRequest;
import by.pvt.api.dto.shopDTO.ShopcartResponse;
import by.pvt.core.domain.Shopcart;

public interface ShopcartMapper {
    ShopcartResponse toResponse(Shopcart shopcart);
    Shopcart toEntity(ShopcartRequest request);
}
