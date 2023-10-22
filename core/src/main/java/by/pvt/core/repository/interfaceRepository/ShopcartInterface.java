package by.pvt.core.repository.interfaceRepository;

import by.pvt.api.dto.shopDTO.ShopcartResponse;
import by.pvt.core.domain.Shopcart;
import java.util.List;

public interface ShopcartInterface
    {

    void addShopcart(Shopcart shopcart);

    List<ShopcartResponse> getAllShopcart();

    ShopcartResponse findById(Long shopcartID);

    void updateShopcart(Shopcart shopcart);

    void delShopcart(long id);
    }
