package by.pvt.core.controller.productCrud;

import by.pvt.api.dto.carDTO.TireRequest;
import by.pvt.api.dto.carDTO.TireResponse;
import by.pvt.core.service.carService.TiresService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("tireedit")
@RequiredArgsConstructor
public class TireController {
    private TiresService tiresService;
    @Autowired
    public TireController(TiresService tiresService) {
        this.tiresService = tiresService;
    }

    @PostMapping("/add")
    public TireResponse add(@Validated @RequestBody TireRequest request) {
        return tiresService.add(request);
    }

    @GetMapping("/get")
    public List<TireResponse> getall(){
        return tiresService.getAll();
    }

    @PostMapping("/edit")
    public TireResponse edit( @Validated @RequestBody TireRequest Request){
        return tiresService.edit(Request);
    }

    @PostMapping("/del")
    public String del(Long id){
        tiresService.delete(id);
        return id + " delete";
    }
}
