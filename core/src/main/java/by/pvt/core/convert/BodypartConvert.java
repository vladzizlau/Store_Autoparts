package by.pvt.core.convert;

import by.pvt.api.dto.carDTO.BodypartRequest;
import by.pvt.api.dto.carDTO.BodypartResponse;
import by.pvt.core.domain.shopDomain.BodyPart;

public class BodypartConvert {
public BodyPart toEntity(BodypartRequest request){
    BodyPart entity = BodyPart.builder()
            .id(request.getId())
            .name(request.getName())
            .count(request.getCount())
            .cost(request.getCost())
            .build();
    return entity;
}

public BodypartResponse toDTO(BodyPart bodyPart)
{
    BodypartResponse dto = BodypartResponse.builder()
            .id(bodyPart.getId())
            .name(bodyPart.getName())
            .count(bodyPart.getCount())
            .cost(bodyPart.getCost())
            .build();
    return dto;
}
}
