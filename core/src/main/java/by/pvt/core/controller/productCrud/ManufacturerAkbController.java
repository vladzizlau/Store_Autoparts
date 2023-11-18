package by.pvt.core.controller.productCrud;

import by.pvt.api.dto.carDTO.ManufacturerAKBRequest;
import by.pvt.api.dto.carDTO.ManufacturerAKBResponse;
import by.pvt.core.service.carService.ManufacturerAKBService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/brandtires")
@RequiredArgsConstructor
public class ManufacturerAkbController {

    private ManufacturerAKBService manufacturerAKBService;

    @Autowired
    public ManufacturerAkbController(ManufacturerAKBService manufacturerAKBService) {
        this.manufacturerAKBService = manufacturerAKBService;
    }

    @PostMapping("/add")
    public ManufacturerAKBResponse add(ManufacturerAKBRequest request) {
        return manufacturerAKBService.add(request);
    }

    @GetMapping("/get")
    public List<ManufacturerAKBResponse> getall(){
        return manufacturerAKBService.getAll();
    }

    @PostMapping("/del")
    public String del(Long id){
        manufacturerAKBService.delete(id);
        return id + " delete";
    }
}
