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
public class BodyPartService implements IBodyPart
    {
    private BodyPartRepo bodyPartRepository;
    private BodypartMapper mapper;

    @Autowired
    public BodyPartService(BodyPartRepo bodyPartRepository, BodypartMapper mapper)
        {
        this.bodyPartRepository = bodyPartRepository;
        this.mapper = mapper;
        }

    @Override
    public void add(BodypartRequest bodyPart)
        {
        bodyPartRepository.save(mapper.toEntity(bodyPart));
        }

    @Override
    public List<BodypartResponse> getAll()
        {
        List<BodyPart> lst = bodyPartRepository.findAll();
        return mapper.toResponseList(lst);
        }

    @Override
    public List<BodypartResponse> getBydypartByPrice(BigDecimal start, BigDecimal end)
        {
        return bodyPartRepository.getBydypartByPrice(start, end);
        }

    @Override
    public BodypartResponse searchById(long id)
        {
        Optional<BodyPart> getbyId = bodyPartRepository.findById(id);
        return mapper.toResponse(getbyId.get());
        }

    @Override
    public void delete(long id)
        {
        bodyPartRepository.deleteById(id);
        }

    @Override
    public void edit(BodypartRequest part)
        {
        bodyPartRepository.save(mapper.toEntity(part));
        }
    }
