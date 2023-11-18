package by.pvt.core.service.interfaceService;

import by.pvt.api.dto.carDTO.BodypartRequest;
import by.pvt.api.dto.carDTO.BodypartResponse;
import by.pvt.core.domain.shopDomain.BodyPart;

import java.math.BigDecimal;
import java.util.List;

public interface IBodyPart {
    BodypartResponse add(BodypartRequest bodyPart);

    List<BodypartResponse> getAll();

    List<BodypartResponse> getBydypartByPrice(BigDecimal start, BigDecimal end);

    BodypartResponse searchById(Long Id);

    void delete(long id);

    BodypartResponse edit(BodypartRequest part);

    List<BodypartResponse> getByCode(Long code);
}
