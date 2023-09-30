package by.pvt.core.service.carService;

import by.pvt.api.dto.carDTO.CarRequest;
import by.pvt.api.dto.carDTO.CarResponse;
import by.pvt.core.convert.CarConvert;
import by.pvt.core.domain.shopDomain.Car;
import by.pvt.core.repository.CarRepository;
import by.pvt.core.service.interfaceService.ICar;

import java.util.Collections;
import java.util.List;

public class CarService implements ICar {
    private final CarRepository carRepository;
    private final CarConvert carConvert;

    public CarService() {
        carRepository = new CarRepository();
        carConvert = new CarConvert();
    }

    @Override
    public void add(CarRequest car) {
        carRepository.addCar(carConvert.toEntity(car));
    }

    @Override
    public List<CarResponse> getAll() {
        return carRepository.getAllCars();
    }

    @Override
    public CarResponse searchById(long Id) {
        return carRepository.findById(Id);
    }

    @Override
    public void delete(long id) {
        carRepository.delCar(id);
    }

    @Override
    public void edit(CarRequest c) {
        Car car = carConvert.toEntity(c);
        car.setCar_brand(c.getCar_brand());
        car.setCar_model(c.getCar_model());
        car.setYear(c.getYear());
        carRepository.updateCar(car);
    }
}
