package by.pvt.core.mapper;

import by.pvt.api.dto.carDTO.ManufacturerAKBRequest;
import by.pvt.api.dto.carDTO.ManufacturerAKBResponse;
import by.pvt.core.domain.shopDomain.ManufacturerAKB;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ManufacturerAkbMapper {
    ManufacturerAKBResponse toResponse(ManufacturerAKB manufacturerAKB);
    ManufacturerAKB toEntity(ManufacturerAKBRequest request);
}
