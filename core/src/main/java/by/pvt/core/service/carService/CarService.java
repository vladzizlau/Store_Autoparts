package by.pvt.core.service.carService;

import by.pvt.api.dto.carDTO.CarModelRequest;
import by.pvt.api.dto.carDTO.CarModelResponse;
import by.pvt.api.dto.carDTO.CarRequest;
import by.pvt.api.dto.carDTO.CarResponse;
import by.pvt.core.convert.CarConvert;
import by.pvt.core.domain.shopDomain.Car;
import by.pvt.core.domain.shopDomain.CarModel;
import by.pvt.core.mapper.CarMapper;
import by.pvt.core.repository.CarModelRepository;
import by.pvt.core.repository.CarRepository;
import by.pvt.core.service.interfaceService.ICar;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CarService implements ICar {
    private final CarRepository carRepository;
    private final CarModelRepository modelRepository;
    private CarMapper carMapper;


    public CarService(CarRepository cr, CarModelRepository cmr) {
        carRepository = cr;
        modelRepository = cmr;
    }

    @Override
    public void addCar(CarRequest car) {
        carRepository.addCar(carMapper.carToEntity(car));
    }
    @Override
    public void addModel(CarModelRequest model) {
        modelRepository.addModel(carMapper.modelToEntity(model));
    }
    @Override
    public List<CarResponse> getAllCar() {
        return carRepository.getAllCars();
    }
    @Override
    public List<CarModelResponse> getAllModel(){
        return modelRepository.getAllModel();
    }

    @Override
    public CarResponse carSearchById(Long Id) {
        return carRepository.findById(Id);
    }
    @Override
    public CarModel modelSearchById(Long id){
        return  modelRepository.getModelById(id);
    }
    @Override
    public List<CarModel> getModelByBrand(Long id)
    {
        return modelRepository.getModelByBrand(id);
    }

    @Override
    public void carDelete(long id) {
        carRepository.delCar(id);
    }
    @Override
    public void modelDelete(long id){
        modelRepository.deleteModel(id);
    }
    @Override
    public void carEdit(CarRequest c) {
        Car car = carMapper.carToEntity(c);
        car.setId(car.getId());
        car.setBrand(car.getBrand());
        carRepository.updateCar(car);
    }

    @Override
    public void modelEdit(CarModelRequest c)
    {
        CarModel model = carMapper.modelToEntity(c);
        model.setId(c.getId());
        model.setModel(c.getModel());
        model.setYear(c.getYear());
        modelRepository.updateModel(model);
    }
}
