package by.pvt.core.service.interfaceService;


import by.pvt.api.dto.carDTO.TireRequest;
import by.pvt.api.dto.carDTO.TireResponse;

import java.util.List;

public interface ITires {
    void add(TireRequest tires);

    List<TireResponse> getAll();

    TireResponse searchById(long Id);

    void delete(long id);

    void edit(TireRequest tires);
}
