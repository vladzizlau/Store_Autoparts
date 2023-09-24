package by.pvt.core.convert;


import by.pvt.api.dto.carDTO.ManufacturerTiresRequest;
import by.pvt.api.dto.carDTO.ManufacturerTiresResponse;
import by.pvt.core.domain.shopDomain.ManufacturerTires;

public class ManufacturerTiresConvert {
    public ManufacturerTires toEntity(ManufacturerTiresRequest request) {
        ManufacturerTires mtires = ManufacturerTires.builder()
                .id(request.getId())
                .name(request.getName())
                .build();

        return mtires;
    }

    public ManufacturerTiresResponse toDTO(ManufacturerTires tires) {
        ManufacturerTiresResponse dto = ManufacturerTiresResponse.builder()
                .id(tires.getId())
                .name(tires.getName())
                .build();
        return dto;
    }
}
