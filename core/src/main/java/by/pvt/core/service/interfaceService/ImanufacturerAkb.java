package by.pvt.core.service.interfaceService;

import by.pvt.api.dto.carDTO.ManufacturerAKBRequest;
import by.pvt.core.domain.shopDomain.ManufacturerAKB;


import java.util.List;

public interface ImanufacturerAkb
    {
    void add(ManufacturerAKBRequest makb);

    List<ManufacturerAKB> getAll();

    void delete(long id);

    }
