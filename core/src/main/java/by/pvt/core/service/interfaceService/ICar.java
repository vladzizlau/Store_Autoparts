package by.pvt.core.service.interfaceService;


import by.pvt.api.dto.carDTO.CarRequest;
import by.pvt.core.domain.shopDomain.Car;

import java.util.List;

public interface ICar
    {
    void add(CarRequest car);

    List<Car> getAll();

    Car searchById(long Id);

    void delete(long id);

    void edit(CarRequest car, String car_brand, String car_model, int year);
}
