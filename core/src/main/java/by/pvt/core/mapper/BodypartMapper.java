package by.pvt.core.mapper;

import by.pvt.api.dto.carDTO.BodypartRequest;
import by.pvt.api.dto.carDTO.BodypartResponse;
import by.pvt.core.domain.shopDomain.BodyPart;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface BodypartMapper {
    BodypartResponse toResponse(BodyPart bodyPart);
    BodyPart toEntity(BodypartRequest request);

    List<BodypartResponse> toResponseList(List <BodyPart> bodyParts);
}
