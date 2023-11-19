package by.pvt.core.service.carService;

import by.pvt.api.dto.carDTO.CarModelRequest;
import by.pvt.api.dto.carDTO.CarModelResponse;
import by.pvt.api.dto.carDTO.CarRequest;
import by.pvt.api.dto.carDTO.CarResponse;
import by.pvt.core.domain.shopDomain.Car;
import by.pvt.core.domain.shopDomain.CarModel;
import by.pvt.core.mapper.CarMapper;
import by.pvt.core.repository.CarModelRepo;
import by.pvt.core.repository.CarRepo;
import by.pvt.core.service.interfaceService.ICar;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CarService implements ICar
    {
    private CarRepo carRepository;
    private CarModelRepo modelRepository;
    private CarMapper carMapper;

    @Autowired
    public CarService(CarRepo carRepository, CarModelRepo modelRepository, CarMapper carMapper)
        {
        this.carRepository = carRepository;
        this.modelRepository = modelRepository;
        this.carMapper = carMapper;
        }


    @Override
    public CarResponse addCar(CarRequest car)
        {
        return carMapper.carToResponse(carRepository.save(carMapper.carToEntity(car)));
        }

    @Override
    public CarModelResponse addModel(CarModelRequest model)
        {
        return carMapper.modelToResponse(modelRepository.save(carMapper.modelToEntity(model)));
        }

    @Override
    public List<CarResponse> getAllCar()
        {
        return carMapper.carResponseList(carRepository.findAll());
        }

    @Override
    public List<CarModelResponse> getAllModel()
        {
        return carMapper.modelResponseList(modelRepository.findAll());
        }

    @Override
    public CarResponse carSearchById(Long Id)
        {
        Optional<Car> byId = carRepository.findById(Id);
        return carMapper.carToResponse(byId.get());
        }

    @Override
    public CarModelResponse modelSearchById(Long id)
        {
        Optional<CarModel> byId = modelRepository.findById(id);
        return carMapper.modelToResponse(byId.get());
        }

    @Override
    public List<CarModelResponse> getModelByBrand(Long id)
        {
        return carMapper.modelResponseList(modelRepository.getModelByBrand(id));
        }

    @Override
    public void carDelete(long id)
        {
        carRepository.deleteById(id);
        }

    @Override
    public void modelDelete(long id)
        {
        modelRepository.deleteById(id);
        }

    @Override
    public CarResponse carEdit(CarRequest c)
        {
         return carMapper.carToResponse(carRepository.save(carMapper.carToEntity(c)));
        }

    @Override
    public CarModelResponse modelEdit(CarModelRequest c)
        {
         return carMapper.modelToResponse(modelRepository.save(carMapper.modelToEntity(c)));
        }
    }
