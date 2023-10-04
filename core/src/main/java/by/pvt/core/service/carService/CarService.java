package by.pvt.core.service.carService;

import by.pvt.api.dto.carDTO.CarModelRequest;
import by.pvt.api.dto.carDTO.CarModelResponse;
import by.pvt.api.dto.carDTO.CarRequest;
import by.pvt.api.dto.carDTO.CarResponse;
import by.pvt.core.convert.CarConvert;
import by.pvt.core.domain.shopDomain.Car;
import by.pvt.core.domain.shopDomain.CarModel;
import by.pvt.core.repository.CarModelRepository;
import by.pvt.core.repository.CarRepository;
import by.pvt.core.service.interfaceService.ICar;

import java.util.List;

public class CarService implements ICar {
    private final CarRepository carRepository;
    private final CarModelRepository modelRepository;
    private final CarConvert carConvert;


    public CarService() {
        carRepository = new CarRepository();
        modelRepository = new CarModelRepository();
        carConvert = new CarConvert();
    }

    @Override
    public void addCar(CarRequest car) {
        carRepository.addCar(carConvert.carToEntity(car));
    }
    @Override
    public void addModel(CarModelRequest model) {
        modelRepository.addModel(carConvert.modelToEntity(model));
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
    public List<CarModelResponse> getModelByBrand(Long id)
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
        Car car = carConvert.carToEntity(c);
        car.setId(car.getId());
        car.setBrand(car.getBrand());
        carRepository.updateCar(car);
    }

    @Override
    public void modelEdit(CarModelRequest c)
    {
        CarModel model = carConvert.modelToEntity(c);
        model.setId(c.getId());
        model.setModel(c.getModel());
        model.setYear(c.getYear());
        modelRepository.updateModel(model);
    }
}
