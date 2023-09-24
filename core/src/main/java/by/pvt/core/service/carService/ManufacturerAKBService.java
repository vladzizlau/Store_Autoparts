package by.pvt.core.service.carService;

import by.pvt.api.dto.carDTO.ManufacturerAKBRequest;
import by.pvt.api.dto.carDTO.ManufacturerAKBResponse;
import by.pvt.core.convert.ManufacturerAKBConvert;
import by.pvt.core.domain.shopDomain.ManufacturerAKB;
import by.pvt.core.repository.manufacturer.ManufacturerAKBRepo;
import by.pvt.core.service.interfaceService.ImanufacturerAkb;

import java.util.List;

public class ManufacturerAKBService implements ImanufacturerAkb
    {
    ManufacturerAKBRepo manufacturerAKBRepo;
    ManufacturerAKBConvert akbConvert;


    public ManufacturerAKBService()
        {
        manufacturerAKBRepo = new ManufacturerAKBRepo();
            akbConvert = new ManufacturerAKBConvert();
        }

    @Override
    public void add(ManufacturerAKBRequest makb)
        {
        manufacturerAKBRepo.add(akbConvert.toEntity(makb));
        }

    @Override
    public List<ManufacturerAKB> getAll()
        {
        return manufacturerAKBRepo.getAll();
        }

    @Override
    public void delete(long id)
        {
        manufacturerAKBRepo.delete(id);
        }


    }
