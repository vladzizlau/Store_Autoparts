package by.pvt.core.service.interfaceService;

import by.pvt.api.dto.carDTO.AkbRequest;
import by.pvt.api.dto.carDTO.AkbResponse;
import by.pvt.core.domain.shopDomain.AKB;

import java.math.BigDecimal;
import java.util.List;

public interface Iakb {
    void add(AkbRequest akb);

    List<AkbResponse> getAll();

    List<AkbResponse> getAKBbyVoltage(int volt);

    List<AkbResponse> getAKBbyBatteryCapacity(Double capacity);

    List<AkbResponse> getAKBbyPrice(BigDecimal start, BigDecimal end);

    AkbResponse searchById(long Id);

    void delete(long id);

    void edit(AkbRequest akb);
}
