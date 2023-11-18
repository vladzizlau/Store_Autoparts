package by.pvt.core.service.interfaceService;

import by.pvt.api.dto.carDTO.AkbRequest;
import by.pvt.api.dto.carDTO.AkbResponse;
import by.pvt.core.domain.shopDomain.AKB;

import java.math.BigDecimal;
import java.util.List;

public interface IAkbService {
    AkbResponse add(AkbRequest request);

    List<AkbResponse> getAll();

    List<AKB> getAKBbyVoltage(int volt);

    List<AkbResponse> getAKBbyBatteryCapacity(Double capacity);

    List<AKB> getAKBbyPrice(BigDecimal start, BigDecimal end);

    AkbResponse searchById(long id);

    void delete(long id);

    AkbResponse edit(AkbRequest a);

    List<AkbResponse> getByCode(Long code);
}
