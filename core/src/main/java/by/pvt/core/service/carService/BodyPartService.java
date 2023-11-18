package by.pvt.core.service.carService;

import by.pvt.api.dto.carDTO.BodypartRequest;
import by.pvt.api.dto.carDTO.BodypartResponse;
import by.pvt.core.domain.shopDomain.BodyPart;
import by.pvt.core.mapper.BodypartMapper;
import by.pvt.core.repository.BodyPartRepo;
import by.pvt.core.service.interfaceService.IBodyPart;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@Service
public class BodyPartService implements IBodyPart {
    private BodyPartRepo bodyPartRepository;
    private BodypartMapper mapper;

    @Autowired
    public BodyPartService(BodyPartRepo bodyPartRepository, BodypartMapper mapper) {
        this.bodyPartRepository = bodyPartRepository;
        this.mapper = mapper;
    }

    @Override
    public BodypartResponse add(BodypartRequest bodyPart) {
        BodyPart bp = bodyPartRepository.save(mapper.toEntity(bodyPart));
        return mapper.toResponse(bp);
    }

    @Override
    public List<BodypartResponse> getAll() {
        List<BodyPart> lst = bodyPartRepository.findAll();
        return mapper.toResponseList(lst);
    }

    @Override
    public List<BodypartResponse> getBydypartByPrice(BigDecimal start, BigDecimal end) {
        return mapper.toResponseList(bodyPartRepository.getBydypartByPrice(start, end));
    }

    @Override
    public BodypartResponse searchById(Long id) {
        return mapper.toResponse(getByid(id));
    }

    private BodyPart getByid(Long id){
        Optional<BodyPart> getbyId = bodyPartRepository.findById(id);
        return getbyId.get();
    }

    public List<BodypartResponse> searchByCarModel(Long modelid) {
       List <BodyPart> zapchast = bodyPartRepository.getBodypartByCarModel(modelid);
        return mapper.toResponseList(zapchast);
    }

    @Override
    public void delete(long id) {
        bodyPartRepository.deleteById(id);
    }

    @Override
    public BodypartResponse edit(BodypartRequest part) {
        return mapper.toResponse(bodyPartRepository.save(mapper.toEntity(part)));
    }

    @Override
    public List<BodypartResponse> getByCode(Long code) {
        return mapper.toResponseList(bodyPartRepository.getTireByCode(code));
    }

}
