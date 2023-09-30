package by.pvt.core.service.interfaceService;


import by.pvt.api.dto.carDTO.CarRequest;
import by.pvt.api.dto.carDTO.CarResponse;
import by.pvt.core.domain.shopDomain.Car;

import java.util.List;

public interface ICar {
    void add(CarRequest car);

    List<CarResponse> getAll();

    CarResponse searchById(long Id);

    void delete(long id);

    void edit(CarRequest car);
}
