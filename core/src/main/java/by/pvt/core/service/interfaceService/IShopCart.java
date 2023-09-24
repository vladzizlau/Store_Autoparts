package by.pvt.core.service.interfaceService;

import by.pvt.api.dto.shopDTO.ShopcartRequest;
import by.pvt.core.domain.Shopcart;

import java.util.List;

public interface IShopCart
    {
    void add(ShopcartRequest shopcart);

    List<Shopcart> getAll();

    Shopcart searchById(long Id);

    void delete(long id);

    void edit(ShopcartRequest shopcart, long orderid, String status, double cost);
}
