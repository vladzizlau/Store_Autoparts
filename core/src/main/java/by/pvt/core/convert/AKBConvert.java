package by.pvt.core.convert;

import by.pvt.api.dto.carDTO.AkbRequest;
import by.pvt.api.dto.carDTO.AkbResponse;
import by.pvt.core.domain.shopDomain.AKB;


public class AKBConvert {
    public AKB akbtoEntity(AkbRequest request) {
        AKB entity = AKB.builder()
                .id(request.getId())
                .name(request.getName())
                .voltage(request.getVoltage())
                .battery_capacity(request.getBatteryCapacity())
                .electric_current(request.getElectricCurrent())
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
                .voltage(akb.getVoltage())
                .batteryCapacity(akb.getBattery_capacity())
                .electricCurrent(akb.getElectric_current())
                .length(akb.getLength())
                .width(akb.getWidth())
                .height(akb.getHeight())
                .price(akb.getPrice())
                .build();
        return dto;
    }


}
