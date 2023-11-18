package by.pvt.core.service.interfaceService;

import by.pvt.api.dto.carDTO.EngineRequest;
import by.pvt.api.dto.carDTO.EngineResponse;
import by.pvt.core.domain.shopDomain.Engine;
import by.pvt.core.domain.shopDomain.EngineType;

import java.math.BigDecimal;
import java.util.List;

public interface IEngine {
    EngineResponse add(EngineRequest engine);

    List<EngineResponse> getAll();

    List<EngineResponse> getEngineByCapacity(Double capacity);

    List<EngineResponse> getEngineByType(EngineType type);

    List<Engine> getEngineByPrice(BigDecimal start, BigDecimal end);

    EngineResponse searchById(long Id);

    void delete(long id);

    EngineResponse edit(EngineRequest engine);

    List<EngineResponse> getByCode(Long code);
}
