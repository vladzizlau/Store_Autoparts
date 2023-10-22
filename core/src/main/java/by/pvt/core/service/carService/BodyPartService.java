package by.pvt.core.service.carService;

import by.pvt.api.dto.carDTO.BodypartRequest;
import by.pvt.api.dto.carDTO.BodypartResponse;
import by.pvt.core.convert.BodypartConvert;
import by.pvt.core.domain.shopDomain.BodyPart;
import by.pvt.core.mapper.BodypartMapper;
import by.pvt.core.repository.BodyPartRepository;
import by.pvt.core.service.interfaceService.IBodyPart;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Collections;
import java.util.List;
@Service
public class BodyPartService implements IBodyPart {
    private final BodyPartRepository bodyPartRepository;
    private BodypartMapper bodypartMapper;

    public BodyPartService(BodyPartRepository bpr) {
        bodyPartRepository = bpr;
    }

    @Override
    public void add(BodypartRequest bodyPart) {
        bodyPartRepository.addBodyPart(bodypartMapper.toEntity(bodyPart));
    }

    @Override
    public List<BodypartResponse> getAll() {
        return bodyPartRepository.getAllBodyParts();
    }
    public List<BodypartResponse> getBodypartByModel(Long modelid){
        return bodyPartRepository.getBodypartByModel(modelid);
    }
    public List<BodypartResponse> getBydypartByPrice(BigDecimal start, BigDecimal end) {
        return bodyPartRepository.getBydypartByPrice(start,end);
    }

    @Override
    public BodypartResponse searchById(long id) {
        return bodyPartRepository.findById(id);
    }

    @Override
    public void delete(long id) {
        bodyPartRepository.delBodyPart(id);
    }

    @Override
    public void edit(BodypartRequest part) {
        BodyPart bodyPart = bodypartMapper.toEntity(part);
        bodyPart.setName(part.getName());
        bodyPart.setCount(part.getCount());
        bodyPart.setCost(part.getCost());
        bodyPartRepository.updateBodyPart(bodypartMapper.toEntity(part));
    }
}
