package by.pvt.core.repository.interfaceRepository;

import by.pvt.core.domain.shopDomain.Engine;
import java.util.List;

public interface EngineInterface
    {

    void addEngine(Engine engine);

    List<Engine> getAllEngine();

    Engine findById(Long engineID);

    void updateEngine(Engine engine);

    void delEngine(long id);
    }
