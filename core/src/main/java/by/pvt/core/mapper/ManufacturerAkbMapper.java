package by.pvt.core.mapper;

import by.pvt.api.dto.carDTO.ManufacturerAKBRequest;
import by.pvt.api.dto.carDTO.ManufacturerAKBResponse;
import by.pvt.core.domain.shopDomain.ManufacturerAKB;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ManufacturerAkbMapper
    {
    ManufacturerAKBResponse toResponse(ManufacturerAKB manufacturerAKB);

    @Mapping(target = "id", ignore = true)
    ManufacturerAKB toEntity(ManufacturerAKBRequest request);

    List<ManufacturerAKBResponse> toResponseList(List<ManufacturerAKB> manufacturerAKBList);
    }
