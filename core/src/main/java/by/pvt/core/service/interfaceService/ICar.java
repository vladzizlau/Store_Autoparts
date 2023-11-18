package by.pvt.core.service.interfaceService;


import by.pvt.api.dto.carDTO.CarModelRequest;
import by.pvt.api.dto.carDTO.CarModelResponse;
import by.pvt.api.dto.carDTO.CarRequest;
import by.pvt.api.dto.carDTO.CarResponse;
import by.pvt.core.domain.shopDomain.Car;
import by.pvt.core.domain.shopDomain.CarModel;

import java.util.List;

public interface ICar {


    CarResponse addCar(CarRequest car);

    CarModelResponse addModel(CarModelRequest model);

    List<CarResponse> getAllCar();

    List<CarModelResponse> getAllModel();

    CarResponse carSearchById(Long Id);

    CarModelResponse modelSearchById(Long id);


    List<CarModelResponse> getModelByBrand(Long id);

    void carDelete(long id);

    void modelDelete(long id);

    CarResponse carEdit(CarRequest c);

    CarModelResponse modelEdit(CarModelRequest c);
}
