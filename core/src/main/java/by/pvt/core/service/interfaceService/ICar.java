package by.pvt.core.service.interfaceService;


import by.pvt.api.dto.carDTO.CarModelRequest;
import by.pvt.api.dto.carDTO.CarModelResponse;
import by.pvt.api.dto.carDTO.CarRequest;
import by.pvt.api.dto.carDTO.CarResponse;
import by.pvt.core.domain.shopDomain.Car;
import by.pvt.core.domain.shopDomain.CarModel;

import java.util.List;

public interface ICar {


    void addCar(CarRequest car);

    void addModel(CarModelRequest model);

    List<CarResponse> getAllCar();

    List<CarModelResponse> getAllModel();

    CarResponse carSearchById(Long Id);

    CarModel modelSearchById(Long id);

    List<CarModel> getModelByBrand(Long id);

    void carDelete(long id);

    void modelDelete(long id);

    void carEdit(CarRequest c);

    void modelEdit(CarModelRequest c);
}
