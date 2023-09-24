package by.pvt.core.service.interfaceService;

import by.pvt.api.dto.carDTO.EngineRequest;
import by.pvt.core.domain.shopDomain.Engine;

import java.util.List;

public interface IEngine
    {
    void add(EngineRequest engine);

    List<Engine> getAll();

    Engine searchById(long Id);

    void delete(long id);

    void edit(EngineRequest engine, String type, double engine_capacity, int count, double cost);
}
