package by.pvt.core.mapper;

import by.pvt.api.dto.shopDTO.ShopcartRequest;
import by.pvt.api.dto.shopDTO.ShopcartResponse;
import by.pvt.core.domain.Shopcart;
import org.mapstruct.Mapper;

import java.util.List;
@Mapper(componentModel = "spring")
public interface ShopcartMapper {
    ShopcartResponse toResponse(Shopcart shopcart);
    Shopcart toEntity(ShopcartRequest request);
    List<ShopcartResponse> toResponseList(List<Shopcart> shopcartList);
}
