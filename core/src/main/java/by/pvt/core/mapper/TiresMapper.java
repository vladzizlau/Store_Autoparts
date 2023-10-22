package by.pvt.core.mapper;

import by.pvt.api.dto.carDTO.TireRequest;
import by.pvt.api.dto.carDTO.TireResponse;
import by.pvt.core.domain.shopDomain.Tire;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface TiresMapper {
    TireResponse toResponse(Tire tire);
    Tire toEntity(TireRequest request);
}
