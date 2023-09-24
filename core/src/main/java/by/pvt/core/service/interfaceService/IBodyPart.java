package by.pvt.core.service.interfaceService;

import by.pvt.api.dto.carDTO.BodypartRequest;
import by.pvt.core.domain.shopDomain.BodyPart;

import java.util.List;

public interface IBodyPart
    {
    void add(BodypartRequest bodyPart);

    List<BodyPart> getAll();

    BodyPart searchById(long Id);

    void delete(long id);

    void edit(BodypartRequest part,  String name, String carBrand, String carModel, int count, double cost);
}
