package by.pvt.core.service.interfaceService;


import by.pvt.api.dto.carDTO.TiresRequest;
import by.pvt.api.dto.carDTO.TiresResponse;
import by.pvt.core.domain.shopDomain.Tires;

import java.util.List;

public interface ITires {
    void add(TiresRequest tires);

    List<TiresResponse> getAll();

    TiresResponse searchById(long Id);

    void delete(long id);

    void edit(TiresRequest tires);
}
