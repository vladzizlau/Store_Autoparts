package by.pvt.core.controller.productCrud;

import by.pvt.api.dto.carDTO.CarLampRequest;
import by.pvt.api.dto.carDTO.CarLampResponse;
import by.pvt.core.service.carService.CarLampService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/carlampedit")
@RequiredArgsConstructor
public class CarlampController {
    private CarLampService carLampService;

    @Autowired
    public CarlampController(CarLampService carLampService) {
        this.carLampService = carLampService;
    }

    @PostMapping("/add")
    public CarLampResponse add(@Validated @RequestBody CarLampRequest request) {
        return carLampService.add(request);
    }

    @GetMapping("/get")
    public List<CarLampResponse> getall(){
        return carLampService.getAll();
    }

    @PostMapping("/edit")
    public CarLampResponse edit( @Validated @RequestBody CarLampRequest Request){
        return carLampService.edit(Request);
    }

    @PostMapping("/del")
    public String del(Long id){
        carLampService.delete(id);
        return id + " delete";
    }
}
