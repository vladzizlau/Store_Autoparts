package by.pvt.core.repository.interfaceRepository;

import by.pvt.api.dto.carDTO.TiresResponse;
import by.pvt.core.domain.shopDomain.Tires;
import java.util.List;

public interface TiresInterface
    {

    void addTires(Tires tires);

    List<TiresResponse> getAllTires();

        TiresResponse findById(Long tiresID);

    void updateTires(Tires tires);

    void delTires(long id);
    }
