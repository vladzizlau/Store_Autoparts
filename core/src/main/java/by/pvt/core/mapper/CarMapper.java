package by.pvt.core.mapper;

import by.pvt.api.dto.carDTO.CarModelRequest;
import by.pvt.api.dto.carDTO.CarModelResponse;
import by.pvt.api.dto.carDTO.CarRequest;
import by.pvt.api.dto.carDTO.CarResponse;
import by.pvt.core.domain.shopDomain.Car;
import by.pvt.core.domain.shopDomain.CarModel;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CarMapper
    {

    CarResponse carToResponse(Car car);

    @Mapping(target = "id", ignore = true)
    Car carToEntity(CarRequest request);

    List<CarResponse> carResponseList(List<Car> carList);

    CarModelResponse modelToResponse(CarModel model);

    @Mapping(target = "id", ignore = true)
    CarModel modelToEntity(CarModelRequest request);

    List<CarModelResponse> modelResponseList(List<CarModel> carModelList);

    }
