package by.pvt.core.service.interfaceService;

import by.pvt.api.dto.shopDTO.ShopcartRequest;
import by.pvt.api.dto.shopDTO.ShopcartResponse;
import by.pvt.core.domain.Shopcart;

import java.util.List;

public interface IShopCart {
    Long add(ShopcartRequest shopcart);

    List<ShopcartResponse> getAll();

    ShopcartResponse searchById(long Id);

    void delete(long id);
}
