package by.pvt.core.service.carService;

import by.pvt.api.dto.carDTO.ManufacturerAKBRequest;
import by.pvt.api.dto.carDTO.ManufacturerAKBResponse;
import by.pvt.core.convert.ManufacturerAKBConvert;
import by.pvt.core.domain.shopDomain.ManufacturerAKB;
import by.pvt.core.mapper.ManufacturerAkbMapper;
import by.pvt.core.repository.manufacturer.ManufacturerAKBRepo;
import by.pvt.core.service.interfaceService.ImanufacturerAkb;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
@Service
public class ManufacturerAKBService implements ImanufacturerAkb
    {
    private ManufacturerAKBRepo manufacturerAKBRepo;
    private ManufacturerAkbMapper akbMapper;


    public ManufacturerAKBService(ManufacturerAKBRepo akbR)
        {
        manufacturerAKBRepo = akbR;
        }

    @Override
    public void add(ManufacturerAKBRequest makb)
        {
        manufacturerAKBRepo.add(akbMapper.toEntity(makb));
        }

    @Override
    public List<ManufacturerAKBResponse> getAll()
        {
        return manufacturerAKBRepo.getAll();
        }

    @Override
    public void delete(long id)
        {
        manufacturerAKBRepo.delete(id);
        }


    }
