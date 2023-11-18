package by.pvt.core.service.interfaceService;

import by.pvt.api.dto.carDTO.CarLampRequest;
import by.pvt.api.dto.carDTO.CarLampResponse;
import by.pvt.core.domain.shopDomain.CarLamp;

import java.util.List;

public interface ICarLamp {
    CarLampResponse add(CarLampRequest lamp);

    List<CarLampResponse> getAll();

    CarLampResponse searchById(long Id);

    void delete(long id);

    CarLampResponse edit(CarLampRequest lamps);

    List<CarLampResponse> getByCode(Long code);
}
