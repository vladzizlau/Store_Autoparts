package by.pvt.core.convert;

import by.pvt.api.dto.carDTO.AkbRequest;
import by.pvt.api.dto.carDTO.AkbResponse;
import by.pvt.core.domain.shopDomain.AKB;


public class AKBConvert {
    public AKB akbtoEntity(AkbRequest request) {
        AKB entity = AKB.builder()
                .id(request.getId())
                .name(request.getName())
                .manufacturer(request.getManufacturer())
                .voltage(request.getVoltage())
                .battery_capacity(request.getBattery_capacity())
                .electric_current(request.getElectric_current())
                .length(request.getLength())
                .width(request.getWidth())
                .height(request.getHeight())
                .price(request.getPrice())
                .build();
        return entity;
    }

    public AkbResponse toDTO(AKB akb) {
        AkbResponse dto = AkbResponse.builder()
                .id(akb.getId())
                .name(akb.getName())
                .manufacturer(akb.getManufacturer())
                .voltage(akb.getVoltage())
                .battery_capacity(akb.getBattery_capacity())
                .electric_current(akb.getElectric_current())
                .length(akb.getLength())
                .width(akb.getWidth())
                .height(akb.getHeight())
                .price(akb.getPrice())
                .build();
        return dto;
    }


}
