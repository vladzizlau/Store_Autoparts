package by.pvt.core.service.interfaceService;


import by.pvt.api.dto.carDTO.TireRequest;
import by.pvt.api.dto.carDTO.TireResponse;
import by.pvt.core.domain.shopDomain.TireType;

import java.math.BigDecimal;
import java.util.List;

public interface ITires {
    TireResponse add(TireRequest tires);

    List<TireResponse> getAll();

    TireResponse searchById(long Id);

    void delete(long id);

    TireResponse edit(TireRequest tires);

    List<TireResponse> getTirebyDiametr(int d);

    List<TireResponse> getTirebyWidth(int w);

    List<TireResponse> getTirebyHeight(int h);

    List<TireResponse> getTirebySeason(TireType type);

    List<TireResponse> getTirebyPrice(BigDecimal start, BigDecimal end);

    List<TireResponse> getByCode(Long code);
}
