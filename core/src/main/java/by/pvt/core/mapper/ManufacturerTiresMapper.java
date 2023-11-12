package by.pvt.core.mapper;

import by.pvt.api.dto.carDTO.ManufacturerTireRequest;
import by.pvt.api.dto.carDTO.ManufacturerTireResponse;
import by.pvt.core.domain.shopDomain.ManufacturerTires;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ManufacturerTiresMapper
    {
    ManufacturerTireResponse toResponse(ManufacturerTires manufacturerTires);

    @Mapping(target = "id", ignore = true)
    ManufacturerTires toEntity(ManufacturerTireRequest request);

    List<ManufacturerTireResponse> toResponseList(List<ManufacturerTires> manufacturerTiresList);
    }
