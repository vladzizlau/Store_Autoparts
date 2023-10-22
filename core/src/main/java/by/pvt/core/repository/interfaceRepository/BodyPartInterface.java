package by.pvt.core.repository.interfaceRepository;

import by.pvt.api.dto.carDTO.BodypartResponse;
import by.pvt.core.domain.shopDomain.BodyPart;

import java.util.List;

public interface BodyPartInterface {

    void addBodyPart(BodyPart parts);

    List<BodypartResponse> getAllBodyParts();

    BodypartResponse findById(Long partsID);

    void updateBodyPart(BodyPart part);

    void delBodyPart(long id);
}
