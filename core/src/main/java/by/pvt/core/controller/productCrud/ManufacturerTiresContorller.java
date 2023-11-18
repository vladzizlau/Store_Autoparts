package by.pvt.core.controller.productCrud;


import by.pvt.api.dto.carDTO.ManufacturerTireRequest;
import by.pvt.api.dto.carDTO.ManufacturerTireResponse;
import by.pvt.core.service.carService.ManufacturerTiresService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/brandakb")
@RequiredArgsConstructor
public class ManufacturerTiresContorller {
    private ManufacturerTiresService manufacturerTiresService;
    @Autowired
    public ManufacturerTiresContorller(ManufacturerTiresService manufacturerTiresService) {
        this.manufacturerTiresService = manufacturerTiresService;
    }

    @PostMapping("/add")
    public ManufacturerTireResponse add(ManufacturerTireRequest request) {
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
