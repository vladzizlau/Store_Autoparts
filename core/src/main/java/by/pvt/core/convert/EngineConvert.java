package by.pvt.core.convert;

import by.pvt.api.dto.carDTO.EngineRequest;
import by.pvt.api.dto.carDTO.EngineResponse;
import by.pvt.core.domain.shopDomain.Engine;

public class EngineConvert {
    public Engine toEntity(EngineRequest request)
    {
        Engine entity = Engine.builder()
                .id(request.getId())
                .name(request.getName())
                .type(request.getType())
                .engine_capacity(request.getEngine_capacity())
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
                .type(engine.getType())
                .engine_capacity(engine.getEngine_capacity())
                .count(engine.getCount())
                .cost(engine.getCost())
                .build();
        return dto;
    }
}
