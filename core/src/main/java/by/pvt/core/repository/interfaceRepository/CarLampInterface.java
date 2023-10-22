package by.pvt.core.repository.interfaceRepository;

import by.pvt.api.dto.carDTO.CarLampResponse;
import by.pvt.core.domain.shopDomain.CarLamp;

import java.math.BigDecimal;
import java.util.List;

public interface CarLampInterface {

    void addCarLamps(CarLamp lamps);

    List<CarLampResponse> getAllLamps();

    List<CarLampResponse> getCarLampByPower(int power);

    List<CarLampResponse> getCarLampBySocket(String socket);

    List<CarLampResponse> getCarLampByPrice(BigDecimal start, BigDecimal end);

    CarLampResponse findById(Long lampID);

    void updateLamps(CarLamp lamps);

    void delCarLamps(long id);
}
