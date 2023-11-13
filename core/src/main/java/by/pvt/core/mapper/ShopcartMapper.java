package by.pvt.core.mapper;

import by.pvt.api.dto.shopDTO.ShopcartRequest;
import by.pvt.api.dto.shopDTO.ShopcartResponse;
import by.pvt.core.domain.Shopcart;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ShopcartMapper
    {
    ShopcartResponse toResponse(Shopcart shopcart);

    @Mapping(target = "id", ignore = true)
    Shopcart toEntity(ShopcartRequest request);

    List<ShopcartResponse> toResponseList(List<Shopcart> shopcartList);
    }
