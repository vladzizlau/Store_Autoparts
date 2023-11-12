package by.pvt.core.service.carService;

import by.pvt.api.dto.carDTO.CarLampRequest;
import by.pvt.api.dto.carDTO.CarLampResponse;
import by.pvt.core.domain.shopDomain.CarLamp;
import by.pvt.core.mapper.CarLampMapper;
import by.pvt.core.repository.CarLampRepo;
import by.pvt.core.service.interfaceService.ICarLamp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@Service
public class CarLampService implements ICarLamp
    {
    private CarLampRepo carLampRepository;
    private CarLampMapper carLampMapper;

    @Autowired
    public CarLampService(CarLampRepo carLampR, CarLampMapper carLampM)
        {
        this.carLampRepository = carLampR;
        this.carLampMapper = carLampM;
        }

    @Override
    public void add(CarLampRequest lamp)
        {
        carLampRepository.save(carLampMapper.toEntity(lamp));
        }

    @Override
    public List<CarLampResponse> getAll()
        {
        return carLampMapper.toResponseList(carLampRepository.findAll());
        }

    public List<CarLampResponse> getCarLampByPower(int power)
        {
        return carLampRepository.getCarLampByPower(power);
        }

    public List<CarLampResponse> getCarLampBySocket(String socket)
        {
        return carLampRepository.getCarLampBySocket(socket);
        }

    public List<CarLampResponse> getCarLampByPrice(BigDecimal start, BigDecimal end)
        {
        return carLampRepository.getCarLampByPrice(start, end);
        }

    @Override
    public CarLampResponse searchById(long Id)
        {
        Optional<CarLamp> byId = carLampRepository.findById(Id);
        return carLampMapper.toResponse(byId.get());
        }

    @Override
    public void delete(long id)
        {
        carLampRepository.deleteById(id);
        }

    @Override
    public void edit(CarLampRequest lamp)
        {
        carLampRepository.save(carLampMapper.toEntity(lamp));
        }
    }
