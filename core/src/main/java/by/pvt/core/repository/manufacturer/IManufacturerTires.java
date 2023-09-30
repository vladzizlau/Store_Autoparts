package by.pvt.core.repository.manufacturer;

import by.pvt.api.dto.carDTO.ManufacturerTiresResponse;
import by.pvt.core.domain.shopDomain.ManufacturerTires;

import java.util.List;

public interface IManufacturerTires
    {
    void add(ManufacturerTires tires);

    List<ManufacturerTiresResponse> getAll();

    void delete(long id);
    }
