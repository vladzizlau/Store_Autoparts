package by.pvt.core.repository.interfaceRepository;

import by.pvt.api.dto.carDTO.EngineResponse;
import by.pvt.core.domain.shopDomain.Engine;

import java.util.List;

public interface EngineInterface {

    void addEngine(Engine engine);

    List<EngineResponse> getAllEngine();

    EngineResponse findById(Long engineID);

    void updateEngine(Engine engine);

    void delEngine(long id);
}
