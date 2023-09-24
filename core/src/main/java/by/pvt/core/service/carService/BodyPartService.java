package by.pvt.core.service.carService;

import by.pvt.api.dto.carDTO.BodypartRequest;
import by.pvt.api.dto.carDTO.BodypartResponse;
import by.pvt.core.convert.BodypartConvert;
import by.pvt.core.domain.shopDomain.BodyPart;
import by.pvt.core.repository.BodyPartRepository;
import by.pvt.core.service.interfaceService.IBodyPart;

import java.util.List;

public class BodyPartService implements IBodyPart
    {
        private final BodyPartRepository bodyPartRepository;
        private final BodypartConvert bodypartConvert;

    public BodyPartService()
        {
        bodyPartRepository = new BodyPartRepository();
        bodypartConvert = new BodypartConvert();
        }

    @Override
    public void add(BodypartRequest bodyPart)
        {
        bodyPartRepository.addBodyPart(bodypartConvert.toEntity(bodyPart));
        }

    @Override
    public List<BodyPart> getAll()
        {
        return bodyPartRepository.getAllBodyParts();
        }

    @Override
    public BodyPart searchById(long id)
        {
        return bodyPartRepository.findById(id);
        }
        public BodypartResponse getBodypartResponse(long id)
        {
            return bodypartConvert.toDTO(searchById(id));
        }

    @Override
    public void delete(long id)
        {
bodyPartRepository.delBodyPart(id);
        }

    @Override
    public void edit(BodypartRequest part, String name, String carBrand, String carModel, int count, double cost)
        {
        part.setName(name);
        part.setCarBrand(carBrand);
        part.setCarModel(carModel);
        part.setCount(count);
        part.setCost(cost);
        bodyPartRepository.updateBodyPart(bodypartConvert.toEntity(part));
        }
    }
