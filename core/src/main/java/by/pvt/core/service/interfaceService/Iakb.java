package by.pvt.core.service.interfaceService;

import by.pvt.api.dto.carDTO.AkbRequest;
import by.pvt.core.domain.shopDomain.AKB;

import java.util.List;

public interface Iakb
    {
    void add(AkbRequest akb);

    List<AKB> getAll();

    AKB searchById(long Id);

    void delete(long id);

    void edit(AkbRequest akb, String manufacturer, String name, int voltage,double battery_capacity, int electric_current, int length, int width, int height, double price);
}
