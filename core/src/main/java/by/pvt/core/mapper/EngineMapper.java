package by.pvt.core.mapper;

import by.pvt.api.dto.carDTO.EngineRequest;
import by.pvt.api.dto.carDTO.EngineResponse;
import by.pvt.core.domain.shopDomain.Engine;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface EngineMapper {
    EngineResponse toResponse(Engine engine);
    Engine toEntity(EngineRequest request);
}
