package by.pvt.core.convert;

import by.pvt.api.dto.carDTO.CarLampRequest;
import by.pvt.api.dto.carDTO.CarLampResponse;
import by.pvt.core.domain.shopDomain.CarLamp;

public class CarlampConvert {
    public CarLamp toEntity(CarLampRequest request)
    {
        CarLamp entity = CarLamp.builder()
                .id(request.getId())
                .name(request.getName())
                .model(request.getModel())
                .socket(request.getSocket())
                .power(request.getPower())
                .count(request.getCount())
                .cost(request.getCost())
                .build();
        return entity;
    }

    public CarLampResponse toDTO(CarLamp lamps)
    {
        CarLampResponse dto = CarLampResponse.builder()
                .id(lamps.getId())
                .name(lamps.getName())
                .model(lamps.getModel())
                .socket(lamps.getSocket())
                .power(lamps.getPower())
                .count(lamps.getCount())
                .cost(lamps.getCost())
                .build();
        return dto;
    }
}
