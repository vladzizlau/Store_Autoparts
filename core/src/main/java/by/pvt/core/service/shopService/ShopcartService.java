package by.pvt.core.service.shopService;

import by.pvt.api.dto.shopDTO.ShopcartRequest;
import by.pvt.api.dto.shopDTO.ShopcartResponse;
import by.pvt.core.domain.Order;
import by.pvt.core.domain.Shopcart;
import by.pvt.core.domain.StatusOrder;
import by.pvt.core.mapper.ShopcartMapper;
import by.pvt.core.repository.ShopcartRepo;
import by.pvt.core.service.interfaceService.IShopCart;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class ShopcartService implements IShopCart {
    private ShopcartRepo shopCartRepository;
    private ShopcartMapper shopcartMapper;
    private OrderService orderService;


    @Autowired
    public ShopcartService(ShopcartRepo shopCartRepository, ShopcartMapper shopcartMapper, OrderService orderService) {
        this.shopCartRepository = shopCartRepository;
        this.shopcartMapper = shopcartMapper;
        this.orderService = orderService;
    }


    @Override
    @Transactional
    public Long add(ShopcartRequest request) {
        Shopcart shopcart = shopcartMapper.toEntity(request);
        if (shopcart != null) {
            shopcart.setOrder(orderService.getThisWorkingOrder(request.getUser()));
            return shopCartRepository.save(shopcart).getId();
        }
        else {
            throw new RuntimeException();
        }
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

}
