package by.pvt.core.repository.interfaceRepository;

import by.pvt.api.dto.carDTO.AkbResponse;
import by.pvt.core.domain.shopDomain.AKB;

import java.math.BigDecimal;
import java.util.List;

public interface AKBInterface {

    void addAKB(AKB akb);

    List<AkbResponse> getAllAKB();

    List<AkbResponse> getAKBbyVoltage(int volt);

    List<AkbResponse> getAKBbyBatteryCapacity(Double capacity);

    List<AkbResponse> getAKBbyPrice(BigDecimal start, BigDecimal end);

    AkbResponse findById(Long akbID);

    void updateAKB(AKB akb);

    void delAKB(long id);
}
