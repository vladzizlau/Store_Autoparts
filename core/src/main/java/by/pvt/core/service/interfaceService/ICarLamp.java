package by.pvt.core.service.interfaceService;

import by.pvt.api.dto.carDTO.CarLampRequest;
import by.pvt.core.domain.shopDomain.CarLamps;

import java.util.List;

public interface ICarLamp
    {
    void add(CarLampRequest lamp);

    List<CarLamps> getAll();

    CarLamps searchById(long Id);

    void delete(long id);

    void edit(CarLampRequest lamps, String name, String model, String socket, String power, int count, double cost);
}
