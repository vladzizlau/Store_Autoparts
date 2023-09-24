package by.pvt.core.service.carService;

import by.pvt.api.dto.carDTO.CarRequest;
import by.pvt.api.dto.carDTO.CarResponse;
import by.pvt.core.convert.CarConvert;
import by.pvt.core.domain.shopDomain.Car;
import by.pvt.core.repository.CarRepository;
import by.pvt.core.service.interfaceService.ICar;

import java.util.List;

public class CarService implements ICar
    {
        private final CarRepository carRepository;
        private final CarConvert carConvert;

    public CarService()
        {
        carRepository = new CarRepository();
        carConvert = new CarConvert();
        }

    @Override
    public void add(CarRequest car)
        {
        carRepository.addCar(carConvert.toEntity(car));
        }

    @Override
    public List<Car> getAll()
        {
        return carRepository.getAllCars();
        }

    @Override
    public Car searchById(long Id)
        {
        return carRepository.findById(Id);
        }
        public CarResponse getCarResponse(long id)
        {
            return carConvert.toDTO(searchById(id));
        }

    @Override
    public void delete(long id)
        {
        carRepository.delCar(id);
        }

    @Override
    public void edit(CarRequest car, String car_brand, String car_model, int year)
        {
        car.setCar_brand(car_brand);
        car.setCar_model(car_model);
        car.setYear(year);
        carRepository.updateCar(carConvert.toEntity(car));
        }
    }
