package by.pvt.core.mapper;

import by.pvt.api.dto.carDTO.TireRequest;
import by.pvt.api.dto.carDTO.TireResponse;
import by.pvt.core.domain.shopDomain.Tire;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface TiresMapper {
    TireResponse toResponse(Tire tire);
    Tire toEntity(TireRequest request);
    List<TireResponse> toResponseList(List<Tire> tireList);
}
