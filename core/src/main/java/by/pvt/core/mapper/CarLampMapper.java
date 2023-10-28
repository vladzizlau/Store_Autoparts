package by.pvt.core.mapper;

import by.pvt.api.dto.carDTO.CarLampRequest;
import by.pvt.api.dto.carDTO.CarLampResponse;
import by.pvt.core.domain.shopDomain.CarLamp;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CarLampMapper {
    CarLampResponse toResponse(CarLamp carLamp);
    CarLamp toEntity(CarLampRequest request);
    List<CarLampResponse> toResponseList(List<CarLamp> carLampList);
}
