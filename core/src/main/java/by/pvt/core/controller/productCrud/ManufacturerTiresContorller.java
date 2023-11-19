package by.pvt.core.controller.productCrud;


import by.pvt.api.dto.carDTO.ManufacturerTireRequest;
import by.pvt.api.dto.carDTO.ManufacturerTireResponse;
import by.pvt.core.service.carService.ManufacturerTiresService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("brandtires")
@RequiredArgsConstructor
public class ManufacturerTiresContorller {
    private ManufacturerTiresService manufacturerTiresService;
    @Autowired
    public ManufacturerTiresContorller(ManufacturerTiresService manufacturerTiresService) {
        this.manufacturerTiresService = manufacturerTiresService;
    }

    @PostMapping("/add")
    public ManufacturerTireResponse add(@Validated @RequestBody ManufacturerTireRequest request) {
        return manufacturerTiresService.add(request);
    }

    @GetMapping("/get")
    public List<ManufacturerTireResponse> getall(){
        return manufacturerTiresService.getAll();
    }

    @PostMapping("/del")
    public String del(Long id){
        manufacturerTiresService.delete(id);
        return id + " delete";
    }
}
