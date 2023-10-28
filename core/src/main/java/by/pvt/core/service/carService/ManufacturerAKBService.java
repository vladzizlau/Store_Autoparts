package by.pvt.core.service.carService;

import by.pvt.api.dto.carDTO.ManufacturerAKBRequest;
import by.pvt.api.dto.carDTO.ManufacturerAKBResponse;
import by.pvt.core.convert.ManufacturerAKBConvert;
import by.pvt.core.domain.shopDomain.ManufacturerAKB;
import by.pvt.core.mapper.ManufacturerAkbMapper;
import by.pvt.core.repository.ManufacturerAKBRepo;
import by.pvt.core.service.interfaceService.ImanufacturerAkb;
import jakarta.persistence.Access;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class ManufacturerAKBService implements ImanufacturerAkb {
    @Autowired
    private ManufacturerAKBRepo manufacturerAKBRepo;
    @Autowired
    private ManufacturerAkbMapper akbMapper;


    @Override
    public void add(ManufacturerAKBRequest makb) {
        manufacturerAKBRepo.save(akbMapper.toEntity(makb));
    }

    @Override
    public List<ManufacturerAKBResponse> getAll() {
        return akbMapper.toResponseList(manufacturerAKBRepo.findAll());
    }

    @Override
    public void delete(long id) {
        manufacturerAKBRepo.deleteById(id);
    }


}
