package by.pvt.core.repository.interfaceRepository;

import by.pvt.api.dto.carDTO.CarResponse;
import by.pvt.core.domain.shopDomain.Car;

import java.util.List;

public interface CarInterface {

    void addCar(Car car);

    List<CarResponse> getAllCars();

    CarResponse findById(Long carID);

    void updateCar(Car car);

    void delCar(long id);
}
