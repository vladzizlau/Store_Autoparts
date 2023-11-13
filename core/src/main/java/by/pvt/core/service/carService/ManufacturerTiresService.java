package by.pvt.core.service.carService;

import by.pvt.api.dto.carDTO.ManufacturerTireRequest;
import by.pvt.api.dto.carDTO.ManufacturerTireResponse;
import by.pvt.core.mapper.ManufacturerTiresMapper;
import by.pvt.core.repository.ManufacturerTiresRepo;
import by.pvt.core.service.interfaceService.ImanufacturerTires;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ManufacturerTiresService implements ImanufacturerTires
    {
    private ManufacturerTiresRepo manufacturerTiresRepo;
    private ManufacturerTiresMapper tiresMapper;

    @Autowired
    public ManufacturerTiresService(ManufacturerTiresRepo manufacturerTiresR, ManufacturerTiresMapper tiresM)
        {
        this.manufacturerTiresRepo = manufacturerTiresR;
        this.tiresMapper = tiresM;
        }

    @Override
    public void add(ManufacturerTireRequest mtires)
        {
        manufacturerTiresRepo.save(tiresMapper.toEntity(mtires));
        }

    @Override
    public List<ManufacturerTireResponse> getAll()
        {
        return tiresMapper.toResponseList(manufacturerTiresRepo.findAll());
        }

    @Override
    public void delete(long id)
        {
        manufacturerTiresRepo.deleteById(id);
        }


    }
