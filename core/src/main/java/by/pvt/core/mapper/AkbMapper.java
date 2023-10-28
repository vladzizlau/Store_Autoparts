package by.pvt.core.mapper;

import by.pvt.api.dto.carDTO.AkbRequest;
import by.pvt.api.dto.carDTO.AkbResponse;
import by.pvt.core.domain.shopDomain.AKB;
import org.mapstruct.Mapper;
import java.util.List;

@Mapper(componentModel = "spring")
public interface AkbMapper {
    AkbResponse toResponse(AKB akb);

    AKB toEntity(AkbRequest request);

    List<AkbResponse> toListResponse(List<AKB> akbList);

}
