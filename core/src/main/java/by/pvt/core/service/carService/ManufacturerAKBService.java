package by.pvt.core.service.carService;

import by.pvt.api.dto.carDTO.ManufacturerAKBRequest;
import by.pvt.api.dto.carDTO.ManufacturerAKBResponse;
import by.pvt.core.mapper.ManufacturerAkbMapper;
import by.pvt.core.repository.ManufacturerAKBRepo;
import by.pvt.core.service.interfaceService.ImanufacturerAkb;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ManufacturerAKBService implements ImanufacturerAkb
    {
    private ManufacturerAKBRepo manufacturerAKBRepo;
    private ManufacturerAkbMapper akbMapper;

    @Autowired
    public ManufacturerAKBService(ManufacturerAKBRepo manufacturerAKBRepo, ManufacturerAkbMapper akbMapper)
        {
        this.manufacturerAKBRepo = manufacturerAKBRepo;
        this.akbMapper = akbMapper;
        }

    @Override
    public ManufacturerAKBResponse add(ManufacturerAKBRequest makb)
        {
        return akbMapper.toResponse(manufacturerAKBRepo.save(akbMapper.toEntity(makb)));
        }

    @Override
    public List<ManufacturerAKBResponse> getAll()
        {
        return akbMapper.toResponseList(manufacturerAKBRepo.findAll());
        }

    @Override
    public void delete(long id)
        {
        manufacturerAKBRepo.deleteById(id);
        }


    }
