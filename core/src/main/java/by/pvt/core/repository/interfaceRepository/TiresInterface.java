package by.pvt.core.repository.interfaceRepository;

import by.pvt.api.dto.carDTO.TireResponse;
import by.pvt.core.domain.shopDomain.Tire;
import java.util.List;

public interface TiresInterface
    {

    void addTires(Tire tire);

    List<TireResponse> getAllTires();

        TireResponse findById(Long tireID);

    void updateTires(Tire tire);

    void delTires(long id);
    }
