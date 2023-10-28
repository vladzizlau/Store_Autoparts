package by.pvt.core.mapper;

import by.pvt.api.dto.carDTO.ManufacturerTireRequest;
import by.pvt.api.dto.carDTO.ManufacturerTireResponse;
import by.pvt.core.domain.shopDomain.ManufacturerTires;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ManufacturerTiresMapper {
    ManufacturerTireResponse toResponse(ManufacturerTires manufacturerTires);

    ManufacturerTires toEntity(ManufacturerTireRequest request);

    List<ManufacturerTireResponse> toResponseList(List<ManufacturerTires> manufacturerTiresList);
}
