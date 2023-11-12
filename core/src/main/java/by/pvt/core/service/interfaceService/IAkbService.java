package by.pvt.core.service.interfaceService;

import by.pvt.api.dto.carDTO.AkbRequest;
import by.pvt.api.dto.carDTO.AkbResponse;
import by.pvt.core.domain.shopDomain.AKB;

import java.math.BigDecimal;
import java.util.List;

public interface IAkbService {
    void add(AkbRequest request);

    List<AkbResponse> getAll();

    List<AKB> getAKBbyVoltage(int volt);

    List<AKB> getAKBbyPrice(BigDecimal start, BigDecimal end);

    AkbResponse searchById(long id);

    void delete(long id);

    void edit(AkbRequest a);
}
