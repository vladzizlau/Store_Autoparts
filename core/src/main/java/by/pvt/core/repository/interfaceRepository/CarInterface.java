package by.pvt.core.repository.interfaceRepository;

import by.pvt.core.domain.shopDomain.Car;
import java.util.List;

public interface CarInterface
    {

    void addCar(Car car);

    List<Car> getAllCars();

    Car findById(Long carID);

    void updateCar(Car car);

    void delCar(long id);
    }
