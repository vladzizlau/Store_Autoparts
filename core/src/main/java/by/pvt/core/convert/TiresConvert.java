package by.pvt.core.convert;

import by.pvt.api.dto.carDTO.TireRequest;
import by.pvt.api.dto.carDTO.TireResponse;
import by.pvt.core.domain.shopDomain.TireType;
import by.pvt.core.domain.shopDomain.Tire;

public class TiresConvert {
    public Tire toEntity(TireRequest request) {
        Tire entity = Tire.builder()
                .id(request.getId())
                .name(request.getName())
                .profile_width(request.getProfileWidth())
                .profile_height(request.getProfileHeight())
                .diametr(request.getDiametr())
                .season(TireType.valueOf(request.getSeason()))
                .price(request.getPrice())
                .build();
        return entity;
    }

    public TireResponse toDTO(Tire tires) {
        TireResponse dto = TireResponse.builder()
                .id(tires.getId())
                .name(tires.getName())
                .profileWidth(tires.getProfile_width())
                .profileHeight(tires.getProfile_height())
                .diametr(tires.getDiametr())
                .season(String.valueOf(tires.getSeason()))
                .price(tires.getPrice())
                .build();
        return dto;
    }
}
