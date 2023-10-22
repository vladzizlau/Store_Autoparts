package by.pvt.core.service.carService;

import by.pvt.api.dto.carDTO.ManufacturerTireRequest;
import by.pvt.api.dto.carDTO.ManufacturerTireResponse;
import by.pvt.core.convert.ManufacturerTiresConvert;
import by.pvt.core.mapper.ManufacturerTiresMapper;
import by.pvt.core.repository.manufacturer.ManufacturerTiresRepo;
import by.pvt.core.service.interfaceService.ImanufacturerTires;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ManufacturerTiresService implements ImanufacturerTires
    {
    private ManufacturerTiresRepo manufacturerTiresRepo;
    private ManufacturerTiresMapper tiresMapper;

    public ManufacturerTiresService(ManufacturerTiresRepo manufacturerTires)
        {
        manufacturerTiresRepo = manufacturerTires;
        }

    @Override
    public void add(ManufacturerTireRequest mtires)
        {
        manufacturerTiresRepo.add(tiresMapper.toEntity(mtires));
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
