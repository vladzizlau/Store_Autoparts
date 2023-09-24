package by.pvt.core.convert;

import by.pvt.api.dto.carDTO.TiresRequest;
import by.pvt.api.dto.carDTO.TiresResponse;
import by.pvt.core.domain.shopDomain.Tires;

public class TiresConvert {
    public Tires toEntity(TiresRequest request) {
        Tires entity = Tires.builder()
                .id(request.getId())
                .manufacturer(request.getManufacturer())
                .name(request.getName())
                .profile_width(request.getProfile_width())
                .profile_height(request.getProfile_height())
                .diametr(request.getDiametr())
                .season(request.getSeason())
                .price(request.getPrice())
                .build();
        return entity;
    }

    public TiresResponse toDTO(Tires tires) {
        TiresResponse dto = TiresResponse.builder()
                .id(tires.getId())
                .manufacturer(tires.getManufacturer())
                .name(tires.getName())
                .profile_width(tires.getProfile_width())
                .profile_height(tires.getProfile_height())
                .diametr(tires.getDiametr())
                .season(tires.getSeason())
                .price(tires.getPrice())
                .build();
        return dto;
    }
}
