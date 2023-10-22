package by.pvt.core.mapper;

import by.pvt.api.dto.carDTO.CarLampRequest;
import by.pvt.api.dto.carDTO.CarLampResponse;
import by.pvt.core.domain.shopDomain.CarLamp;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CarLampMapper {
    CarLampResponse toResponse(CarLamp carLamp);
    CarLamp toEntity(CarLampRequest request);
}
