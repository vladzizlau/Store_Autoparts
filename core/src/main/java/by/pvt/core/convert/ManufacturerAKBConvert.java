package by.pvt.core.convert;

import by.pvt.api.dto.carDTO.ManufacturerAKBRequest;
import by.pvt.api.dto.carDTO.ManufacturerAKBResponse;
import by.pvt.core.domain.shopDomain.ManufacturerAKB;

public class ManufacturerAKBConvert {
    public ManufacturerAKB toEntity(ManufacturerAKBRequest request) {
        ManufacturerAKB mAKB = ManufacturerAKB.builder()
                .id(request.getId())
                .name(request.getName())
                .build();

        return mAKB;
    }

    public ManufacturerAKBResponse toDTO(ManufacturerAKB akb) {
        ManufacturerAKBResponse dto = ManufacturerAKBResponse.builder()
                .id(akb.getId())
                .name(akb.getName())
                .build();
        return dto;
    }
}
