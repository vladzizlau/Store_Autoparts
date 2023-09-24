package by.pvt.core.service.interfaceService;


import by.pvt.api.dto.carDTO.TiresRequest;
import by.pvt.core.domain.shopDomain.Tires;

import java.util.List;

public interface ITires
    {
    void add(TiresRequest tires);

    List<Tires> getAll();

    Tires searchById(long Id);

    void delete(long id);

    void edit(TiresRequest tires, String manufacturer, String name, double profile_width, double profile_height, int diametr, String season, double price);
}
