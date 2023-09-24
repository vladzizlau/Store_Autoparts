package by.pvt.core.repository.interfaceRepository;

import by.pvt.core.domain.Shopcart;
import java.util.List;

public interface ShopcartInterface
    {

    void addShopcart(Shopcart shopcart);

    List<Shopcart> getAllShopcart();

    Shopcart findById(Long shopcartID);

    void updateShopcart(Shopcart shopcart);

    void delShopcart(long id);
    }
