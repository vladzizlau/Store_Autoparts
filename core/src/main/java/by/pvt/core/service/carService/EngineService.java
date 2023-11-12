package by.pvt.core.service.carService;

import by.pvt.api.dto.carDTO.EngineRequest;
import by.pvt.api.dto.carDTO.EngineResponse;
import by.pvt.core.domain.shopDomain.Engine;
import by.pvt.core.domain.shopDomain.EngineType;
import by.pvt.core.mapper.EngineMapper;
import by.pvt.core.repository.EngineRepo;
import by.pvt.core.service.interfaceService.IEngine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@Service
public class EngineService implements IEngine
    {
    private EngineRepo engineRepository;
    private EngineMapper engineMapper;

    @Autowired
    public EngineService(EngineRepo engineRepository, EngineMapper engineMapper)
        {
        this.engineRepository = engineRepository;
        this.engineMapper = engineMapper;
        }

    @Override
    public void add(EngineRequest engine)
        {
        engineRepository.save(engineMapper.toEntity(engine));
        }

    @Override
    public List<EngineResponse> getAll()
        {
        return engineMapper.toResponseList(engineRepository.findAll());
        }

    @Override
    public List<EngineResponse> getEngineByCapacity(Double capacity)
        {
        return engineRepository.getEngineByCapacity(capacity);
        }

    @Override
    public List<EngineResponse> getEngineByType(EngineType type)
        {
        return engineRepository.getEngineByType(type);
        }

    @Override
    public List<Engine> getEngineByPrice(BigDecimal start, BigDecimal end)
        {
        return engineRepository.getEngineByPrice(start, end);
        }

    @Override
    public EngineResponse searchById(long Id)
        {
        Optional<Engine> byId = engineRepository.findById(Id);
        return engineMapper.toResponse(byId.get());
        }

    @Override
    public void delete(long id)
        {
        engineRepository.deleteById(id);
        }

    @Override
    public void edit(EngineRequest e)
        {
        engineRepository.save(engineMapper.toEntity(e));
        }


    }
