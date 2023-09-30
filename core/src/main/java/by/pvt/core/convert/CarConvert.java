package by.pvt.core.convert;

import by.pvt.api.dto.carDTO.CarRequest;
import by.pvt.api.dto.carDTO.CarResponse;
import by.pvt.core.domain.shopDomain.Car;

public class CarConvert {
    public Car toEntity (CarRequest request)
    {
        Car car = Car.builder()
                .id(request.getId())
                .car_brand(request.getCar_brand())
                .car_model(request.getCar_model())
                .year(request.getYear())
                .build();
        return car;
    }

    public CarResponse toDTO(Car car)
    {
        CarResponse dto = CarResponse.builder()
                .id(car.getId())
                .car_brand(car.getCar_brand())
                .car_model(car.getCar_model())
                .year(car.getYear())
                .build();
        return dto;
    }
}
