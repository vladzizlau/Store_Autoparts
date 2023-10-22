package by.pvt.core.service.interfaceService;

import by.pvt.api.dto.carDTO.ManufacturerTireRequest;
import by.pvt.api.dto.carDTO.ManufacturerTireResponse;

import java.util.List;

public interface ImanufacturerTires
    {
    void add(ManufacturerTireRequest mtires);

    List<ManufacturerTireResponse> getAll();

    void delete(long id);


    }
