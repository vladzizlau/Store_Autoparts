package by.pvt.core.service.interfaceService;

import by.pvt.api.dto.carDTO.CarLampRequest;
import by.pvt.api.dto.carDTO.CarLampResponse;
import by.pvt.core.domain.shopDomain.CarLamps;

import java.util.List;

public interface ICarLamp {
    void add(CarLampRequest lamp);

    List<CarLampResponse> getAll();

    CarLampResponse searchById(long Id);

    void delete(long id);

    void edit(CarLampRequest lamps);
}
