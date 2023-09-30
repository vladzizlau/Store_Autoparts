package by.pvt.core.repository.interfaceRepository;

import by.pvt.api.dto.carDTO.AkbResponse;
import by.pvt.core.domain.shopDomain.AKB;

import java.util.List;

public interface AKBInterface {

    void addAKB(AKB akb);

    List<AkbResponse> getAllAKB();

    AkbResponse findById(Long akbID);

    void updateAKB(AKB akb);

    void delAKB(long id);
}
