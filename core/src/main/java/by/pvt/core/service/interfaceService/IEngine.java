package by.pvt.core.service.interfaceService;

import by.pvt.api.dto.carDTO.EngineRequest;
import by.pvt.api.dto.carDTO.EngineResponse;
import by.pvt.core.domain.shopDomain.Engine;

import java.util.List;

public interface IEngine {
    void add(EngineRequest engine);

    List<EngineResponse> getAll();

    EngineResponse searchById(long Id);

    void delete(long id);

    void edit(EngineRequest engine);
}
