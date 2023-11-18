package by.pvt.core.controller.productCrud;

import by.pvt.api.dto.carDTO.CarModelRequest;
import by.pvt.api.dto.carDTO.CarModelResponse;
import by.pvt.api.dto.carDTO.CarRequest;
import by.pvt.api.dto.carDTO.CarResponse;
import by.pvt.core.domain.shopDomain.Car;
import by.pvt.core.domain.shopDomain.CarModel;
import by.pvt.core.service.carService.CarService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/caredit")
@RequiredArgsConstructor
public class CarController {

    private CarService carService;

    @Autowired
    public CarController(CarService carService) {
        this.carService = carService;
    }

    @PostMapping("/addcar")
    public CarResponse addcar(@Validated
                              @RequestBody
                              CarRequest request) {
        return carService.addCar(request);
    }

    @PostMapping("/addmodel")
    public CarModelResponse addmodel(@Validated @RequestBody CarModelRequest request) {
        return carService.addModel(request);
    }

    @GetMapping("/getallcars")
    public List<CarResponse> getcars() {
        return carService.getAllCar();
    }

    @GetMapping("/getallmodels")
    public List<CarModelResponse> getmodels() {
        return carService.getAllModel();
    }

    @PostMapping("/editcar")
    public CarResponse editcar(@Validated @RequestBody CarRequest Request) {
        return carService.carEdit(Request);
    }

    @PostMapping("/editmodel")
    public CarModelResponse editmodel(@Validated @RequestBody CarModelRequest Request) {
        return carService.modelEdit(Request);
    }

    @PostMapping("/delcar")
    public String delсфк(Long id) {
        carService.carDelete(id);
        return id + " delete";
    }

    @PostMapping("/delmodel")
    public String delьщвуд(Long id) {
        carService.modelDelete(id);
        return id + " delete";
    }

    @GetMapping
    public List<CarModelResponse> getallByCar(Long id) {
        return carService.getModelByBrand(id);
    }
}
