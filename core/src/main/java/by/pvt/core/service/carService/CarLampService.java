package by.pvt.core.service.carService;

import by.pvt.api.dto.carDTO.CarLampRequest;
import by.pvt.api.dto.carDTO.CarLampResponse;
import by.pvt.core.convert.CarlampConvert;
import by.pvt.core.domain.shopDomain.CarLamp;
import by.pvt.core.mapper.CarLampMapper;
import by.pvt.core.repository.CarLampRepository;
import by.pvt.core.service.interfaceService.ICarLamp;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Collections;
import java.util.List;
@Service
public class CarLampService implements ICarLamp {
    private final CarLampRepository carLampRepository;
    private CarLampMapper carLampMapper;

    public CarLampService(CarLampRepository clr) {
        carLampRepository = clr;
    }

    @Override
    public void add(CarLampRequest lamp) {
        carLampRepository.addCarLamps(carLampMapper.toEntity(lamp));
    }

    @Override
    public List<CarLampResponse> getAll() {
        return carLampRepository.getAllLamps();
    }
    public List<CarLampResponse> getCarLampByPower(int power)
    {return carLampRepository.getCarLampByPower(power); }
    public List<CarLampResponse> getCarLampBySocket(String socket)
    {return carLampRepository.getCarLampBySocket(socket); }
    public List<CarLampResponse> getCarLampByPrice(BigDecimal start, BigDecimal end)
    {return carLampRepository.getCarLampByPrice(start, end); }
    @Override
    public CarLampResponse searchById(long Id) {
        return carLampRepository.findById(Id);
    }

    @Override
    public void delete(long id) {
        carLampRepository.delCarLamps(id);
    }

    @Override
    public void edit(CarLampRequest lamp) {
        CarLamp lamps = carLampMapper.toEntity(lamp);
        lamps.setName(lamps.getName());
        lamps.setModel(lamps.getModel());
        lamps.setSocket(lamps.getSocket());
        lamps.setPower(lamps.getPower());
        lamps.setCount(lamps.getCount());
        lamps.setCost(lamps.getCost());
        carLampRepository.updateLamps(lamps);
    }
}
