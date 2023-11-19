package by.pvt.core.mapper;

import by.pvt.api.dto.carDTO.EngineRequest;
import by.pvt.api.dto.carDTO.EngineResponse;
import by.pvt.core.domain.shopDomain.Engine;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface EngineMapper
    {
    EngineResponse toResponse(Engine engine);

    @Mapping(target = "id", ignore = true)
    Engine toEntity(EngineRequest request);

    List<EngineResponse> toResponseList(List<Engine> engineList);
    }
