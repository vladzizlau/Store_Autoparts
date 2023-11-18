package by.pvt.core.convert;


import by.pvt.api.dto.carDTO.ManufacturerTireRequest;
import by.pvt.api.dto.carDTO.ManufacturerTireResponse;
import by.pvt.core.domain.shopDomain.ManufacturerTires;

public class ManufacturerTiresConvert {
    public ManufacturerTires toEntity(ManufacturerTireRequest request) {
        ManufacturerTires mtires = ManufacturerTires.builder()
                .id(request.getId())
                .name(request.getName())
                .build();

        return mtires;
    }

    public ManufacturerTireResponse toDTO(ManufacturerTires tires) {
        ManufacturerTireResponse dto = ManufacturerTireResponse.builder()
                .id(tires.getId())
                .name(tires.getName())
                .build();
        return dto;
    }
}
