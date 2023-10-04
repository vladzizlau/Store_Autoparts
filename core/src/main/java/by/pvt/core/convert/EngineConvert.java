package by.pvt.core.convert;

import by.pvt.api.dto.carDTO.EngineRequest;
import by.pvt.api.dto.carDTO.EngineResponse;
import by.pvt.core.domain.shopDomain.Engine;
import by.pvt.core.domain.shopDomain.EngineType;

public class EngineConvert {
    public Engine toEntity(EngineRequest request)
    {
        Engine entity = Engine.builder()
                .id(request.getId())
                .name(request.getName())
                .type(EngineType.valueOf(request.getType()))
                .engineCapacity(request.getEngineCapacity())
                .count(request.getCount())
                .cost(request.getCost())
                .build();
        return entity;
    }

    public EngineResponse toDTO(Engine engine)
    {
        EngineResponse dto= EngineResponse.builder()
                .id(engine.getId())
                .name(engine.getName())
                .type(String.valueOf(engine.getType()))
                .engineCapacity(engine.getEngineCapacity())
                .count(engine.getCount())
                .cost(engine.getCost())
                .build();
        return dto;
    }
}
