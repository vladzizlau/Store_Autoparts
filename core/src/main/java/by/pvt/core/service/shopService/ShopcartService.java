package by.pvt.core.service.shopService;

import by.pvt.api.dto.shopDTO.ShopcartRequest;
import by.pvt.api.dto.shopDTO.ShopcartResponse;
import by.pvt.core.convert.ShopcartConvert;
import by.pvt.core.domain.Shopcart;
import by.pvt.core.repository.ShopCartRepository;
import by.pvt.core.service.interfaceService.IShopCart;

import java.util.Collections;
import java.util.List;

public class ShopcartService implements IShopCart {
    private final ShopCartRepository shopCartRepository;
    private final ShopcartConvert shopcartConvert;

    public ShopcartService() {
        shopCartRepository = new ShopCartRepository();
        shopcartConvert = new ShopcartConvert();
    }

    @Override
    public void add(ShopcartRequest shopcart) {
        shopCartRepository.addShopcart(shopcartConvert.shopcartToEntity(shopcart));
    }

    @Override
    public List<ShopcartResponse> getAll() {
         return shopCartRepository.getAllShopcart();
    }

    @Override
    public ShopcartResponse searchById(long Id) {
        return shopCartRepository.findById(Id);
    }

    @Override
    public void delete(long id) {
        shopCartRepository.delShopcart(id);
    }

    @Override
    public void edit(ShopcartRequest shr) {
        Shopcart shopcart = shopcartConvert.shopcartToEntity(shr);
//        shopcart.setCount(shr.);
        shopcart.setStatus(shr.getStatus());
        shopcart.setCost(shr.getCost());
        shopCartRepository.updateShopcart(shopcart);
    }
}
