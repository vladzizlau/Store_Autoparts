package by.pvt.core.repository.interfaceRepository;

import by.pvt.api.dto.carDTO.CarLampResponse;
import by.pvt.core.domain.shopDomain.CarLamps;

import java.util.List;

public interface CarLampsInterface {

    void addCarLamps(CarLamps lamps);

    List<CarLampResponse> getAllLamps();

    CarLampResponse findById(Long lampID);

    void updateLamps(CarLamps lamps);

    void delCarLamps(long id);
}
