package by.pvt.core.service.carService;

import by.pvt.api.dto.carDTO.CarLampRequest;
import by.pvt.api.dto.carDTO.CarLampResponse;
import by.pvt.core.convert.CarlampConvert;
import by.pvt.core.domain.shopDomain.CarLamps;
import by.pvt.core.repository.CarLampRepository;
import by.pvt.core.service.interfaceService.ICarLamp;

import java.util.List;

public class CarLampService implements ICarLamp
    {
        private final CarLampRepository carLampRepository;
        private final CarlampConvert carlampConvert;

    public CarLampService()
        {
        carLampRepository = new CarLampRepository();
        carlampConvert = new CarlampConvert();
        }

    @Override
    public void add(CarLampRequest lamp)
        {
        carLampRepository.addCarLamps(carlampConvert.toEntity(lamp));
        }

    @Override
    public List<CarLamps> getAll()
        {
        return carLampRepository.getAllLamps();
        }

    @Override
    public CarLamps searchById(long Id)
        {
        return carLampRepository.findById(Id);
        }
        public CarLampResponse getCarlampResponse(long id)
        {
            return carlampConvert.toDTO(searchById(id));
        }

    @Override
    public void delete(long id)
        {
        carLampRepository.delCarLamps(id);
        }

    @Override
    public void edit(CarLampRequest lamps, String name, String model, String socket, String power, int count, double cost)
        {
        lamps.setName(name);
        lamps.setModel(model);
        lamps.setSocket(socket);
        lamps.setPower(power);
        lamps.setCount(count);
        lamps.setCost(cost);
        carLampRepository.updateLamps(carlampConvert.toEntity(lamps));
        }
    }
