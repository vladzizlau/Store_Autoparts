package by.pvt.core.service.interfaceService;

import by.pvt.api.dto.carDTO.ManufacturerTiresRequest;
import by.pvt.api.dto.carDTO.ManufacturerTiresResponse;
import by.pvt.core.domain.shopDomain.ManufacturerTires;

import java.util.List;

public interface ImanufacturerTires
    {
    void add(ManufacturerTiresRequest mtires);

    List<ManufacturerTiresResponse> getAll();

    void delete(long id);


    }
