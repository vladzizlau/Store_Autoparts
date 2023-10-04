package by.pvt.core.service.carService;

import by.pvt.api.dto.carDTO.EngineRequest;
import by.pvt.api.dto.carDTO.EngineResponse;
import by.pvt.api.dto.carDTO.TireResponse;
import by.pvt.core.convert.EngineConvert;
import by.pvt.core.domain.shopDomain.Engine;
import by.pvt.core.domain.shopDomain.EngineType;
import by.pvt.core.domain.shopDomain.TireType;
import by.pvt.core.repository.EngineRepository;
import by.pvt.core.service.interfaceService.IEngine;

import java.math.BigDecimal;
import java.util.List;

public class EngineService implements IEngine {
    private final EngineRepository engineRepository;
    private final EngineConvert engineConvert;


    public EngineService() {
        engineRepository = new EngineRepository();
        engineConvert = new EngineConvert();
    }

    @Override
    public void add(EngineRequest engine) {
        engineRepository.addEngine(engineConvert.toEntity(engine));
    }

    @Override
    public List<EngineResponse> getAll() {
        return engineRepository.getAllEngine();
    }
    @Override
    public List<EngineResponse> getEngineByCapacity(Double capacity)
    {return engineRepository.getEngineByCapacity(capacity); }
    @Override
    public List<EngineResponse> getEngineByType(EngineType type)
    {return engineRepository.getEngineByType(type);}
    @Override
    public List<EngineResponse> getEngineByPrice(BigDecimal start, BigDecimal end)
    {return engineRepository.getEngineByPrice(start, end);}

    @Override
    public EngineResponse searchById(long Id) {
        return engineRepository.findById(Id);
    }

    @Override
    public void delete(long id) {
        engineRepository.delEngine(id);
    }

    @Override
    public void edit(EngineRequest e) {
        Engine engine = engineConvert.toEntity(e);
        engine.setType(EngineType.valueOf(e.getType()));
        engine.setEngineCapacity(e.getEngineCapacity());
        engine.setCount(e.getCount());
        engine.setCost(e.getCost());
        engineRepository.updateEngine(engine);
    }


}
