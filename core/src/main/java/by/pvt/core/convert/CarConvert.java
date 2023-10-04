package by.pvt.core.convert;

import by.pvt.api.dto.carDTO.CarModelRequest;
import by.pvt.api.dto.carDTO.CarModelResponse;
import by.pvt.api.dto.carDTO.CarRequest;
import by.pvt.api.dto.carDTO.CarResponse;
import by.pvt.core.domain.shopDomain.Car;
import by.pvt.core.domain.shopDomain.CarModel;

import java.util.Collections;

public class CarConvert {
    public Car carToEntity(CarRequest request) {
        Car car = Car.builder()
                .id(request.getId())
                .brand(request.getBrand())
                .build();
        return car;
    }

    public CarResponse carToDTO(Car car) {
        CarResponse dto = CarResponse.builder()
                .id(car.getId())
                .brand(car.getBrand())
                .build();
        return dto;
    }

    public CarModel modelToEntity(CarModelRequest modelRequest)
    {
        CarModel model = CarModel.builder()
                .id(modelRequest.getId())
                .model(modelRequest.getModel())
                .year(modelRequest.getYear())
                .build();
        return model;
    }

    public CarModelResponse modelToDTO(CarModel model)
    {
        CarModelResponse resp = CarModelResponse.builder()
                .id(model.getId())
                .model(model.getModel())
                .year(model.getYear())
                .build();
        return resp;
    }
}
