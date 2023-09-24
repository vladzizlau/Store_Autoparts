package by.pvt.core.service.carService;

import by.pvt.api.dto.carDTO.EngineRequest;
import by.pvt.api.dto.carDTO.EngineResponse;
import by.pvt.core.convert.EngineConvert;
import by.pvt.core.domain.shopDomain.Engine;
import by.pvt.core.repository.EngineRepository;
import by.pvt.core.service.interfaceService.IEngine;

import java.util.List;

public class EngineService implements IEngine
    {
        private final EngineRepository engineRepository;
        private final EngineConvert engineConvert;


    public EngineService()
        {
        engineRepository = new EngineRepository();
        engineConvert = new EngineConvert();
        }

    @Override
    public void add(EngineRequest engine)
        {
        engineRepository.addEngine(engineConvert.toEntity(engine));
        }

    @Override
    public List<Engine> getAll()
        {
        return engineRepository.getAllEngine();
        }

    @Override
    public Engine searchById(long Id)
        {
        return engineRepository.findById(Id);
        }
        public EngineResponse getEngineResponse(long id){
        return engineConvert.toDTO(searchById(id));
        }

    @Override
    public void delete(long id)
        {
        engineRepository.delEngine(id);
        }

    @Override
    public void edit(EngineRequest engine, String type, double engine_capacity, int count, double cost)
        {
        engine.setType(type);
        engine.setEngine_capacity(engine_capacity);
        engine.setCount(count);
        engine.setCost(cost);
        engineRepository.updateEngine(engineConvert.toEntity(engine));
        }
    }
