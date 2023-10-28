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
public class CarService implements ICar {
    @Autowired
    private CarRepo carRepository;
    @Autowired
    private CarModelRepo modelRepository;
    @Autowired
    private CarMapper carMapper;


    @Override
    public void addCar(CarRequest car) {
        carRepository.save(carMapper.carToEntity(car));
    }
    @Override
    public void addModel(CarModelRequest model) {
        modelRepository.save(carMapper.modelToEntity(model));
    }
    @Override
    public List<CarResponse> getAllCar() {
        return carMapper.carResponseList(carRepository.findAll());
    }
    @Override
    public List<CarModelResponse> getAllModel(){
        return carMapper.modelResponseList(modelRepository.findAll());
    }

    @Override
    public CarResponse carSearchById(Long Id) {
        Optional<Car> byId = carRepository.findById(Id);
        return carMapper.carToResponse(byId.get());
    }
    @Override
    public CarModelResponse modelSearchById(Long id){
        Optional <CarModel> byId = modelRepository.findById(id);
        return  carMapper.modelToResponse(byId.get());
    }
    @Override
    public List<CarModel> getModelByBrand(Long id)
    {
        return modelRepository.getModelByBrand(id);
    }

    @Override
    public void carDelete(long id) {
        carRepository.deleteById(id);
    }
    @Override
    public void modelDelete(long id){
        modelRepository.deleteById(id);
    }
    @Override
    public void carEdit(CarRequest c) {
        Car car = carMapper.carToEntity(c);
        car.setId(car.getId());
        car.setBrand(car.getBrand());
        carRepository.save(car);
    }

    @Override
    public void modelEdit(CarModelRequest c)
    {
        CarModel model = carMapper.modelToEntity(c);
        model.setId(c.getId());
        model.setModel(c.getModel());
        model.setYear(c.getYear());
        modelRepository.save(model);
    }
}
