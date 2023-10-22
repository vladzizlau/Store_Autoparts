package by.pvt.core.repository.interfaceRepository;

import by.pvt.api.dto.carDTO.EngineResponse;
import by.pvt.core.domain.shopDomain.Engine;
import by.pvt.core.domain.shopDomain.EngineType;

import java.math.BigDecimal;
import java.util.List;

public interface EngineInterface {

    void addEngine(Engine engine);

    List<EngineResponse> getAllEngine();

    List<EngineResponse> getEngineByCapacity(Double capacity);

    List<EngineResponse> getEngineByType(EngineType type);

    List<Engine> getEngineByPrice(BigDecimal start, BigDecimal end);

    EngineResponse findById(Long engineID);

    void updateEngine(Engine engine);

    void delEngine(long id);
}
