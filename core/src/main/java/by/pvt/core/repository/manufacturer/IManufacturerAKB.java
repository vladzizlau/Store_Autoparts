package by.pvt.core.repository.manufacturer;

import by.pvt.core.domain.shopDomain.ManufacturerAKB;

import java.util.List;

public interface IManufacturerAKB
    {

    void add(ManufacturerAKB manufacturerAKB);

    List<ManufacturerAKB> getAll();


    void delete(long id);
    }
