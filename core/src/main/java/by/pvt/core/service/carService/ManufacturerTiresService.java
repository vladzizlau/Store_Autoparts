package by.pvt.core.service.carService;

import by.pvt.api.dto.carDTO.ManufacturerTireRequest;
import by.pvt.api.dto.carDTO.ManufacturerTireResponse;
import by.pvt.core.convert.ManufacturerTiresConvert;
import by.pvt.core.repository.manufacturer.ManufacturerTiresRepo;
import by.pvt.core.service.interfaceService.ImanufacturerTires;

import java.util.List;

public class ManufacturerTiresService implements ImanufacturerTires
    {
    ManufacturerTiresRepo manufacturerTiresRepo;
    ManufacturerTiresConvert tiresConvert;

    public ManufacturerTiresService()
        {
        manufacturerTiresRepo = new ManufacturerTiresRepo();
        tiresConvert = new ManufacturerTiresConvert();
        }

    @Override
    public void add(ManufacturerTireRequest mtires)
        {
        manufacturerTiresRepo.add(tiresConvert.toEntity(mtires));
        }

    @Override
    public List<ManufacturerTireResponse> getAll()
        {
        return manufacturerTiresRepo.getAll();
        }

    @Override
    public void delete(long id)
        {
manufacturerTiresRepo.delete(id);
        }



    }
