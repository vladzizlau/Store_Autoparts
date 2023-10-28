package by.pvt.core.service.shopService;

import by.pvt.api.dto.shopDTO.ShopcartRequest;
import by.pvt.api.dto.shopDTO.ShopcartResponse;
import by.pvt.core.domain.Shopcart;
import by.pvt.core.mapper.ShopcartMapper;
import by.pvt.core.repository.ShopcartRepo;
import by.pvt.core.service.interfaceService.IShopCart;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ShopcartService implements IShopCart {
    @Autowired
    private ShopcartRepo shopCartRepository;
    @Autowired
    private ShopcartMapper shopcartMapper;

    @Override
    public void add(ShopcartRequest shopcart) {
        shopCartRepository.save(shopcartMapper.toEntity(shopcart));
    }

    @Override
    public List<ShopcartResponse> getAll() {
         return shopcartMapper.toResponseList(shopCartRepository.findAll());
    }

    @Override
    public ShopcartResponse searchById(long Id) {
        Optional<Shopcart> byId = shopCartRepository.findById(Id);
        return shopcartMapper.toResponse(byId.get());
    }

    @Override
    public void delete(long id) {
        shopCartRepository.deleteById(id);
    }

    @Override
    public void edit(ShopcartRequest shr) {
        Shopcart shopcart = shopcartMapper.toEntity(shr);
        shopcart.setCount(shr.getCount());
        shopcart.setStatus(shr.getStatus());
        shopcart.setCost(shr.getCost());
        shopCartRepository.save(shopcart);
    }
}
