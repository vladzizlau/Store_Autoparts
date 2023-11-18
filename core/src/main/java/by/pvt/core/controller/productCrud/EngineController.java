package by.pvt.core.controller.productCrud;

import by.pvt.api.dto.carDTO.EngineRequest;
import by.pvt.api.dto.carDTO.EngineResponse;
import by.pvt.core.service.carService.EngineService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/engineedit")
@RequiredArgsConstructor
public class EngineController {
    private EngineService engineService;

    @Autowired
    public EngineController(EngineService engineService) {
        this.engineService = engineService;
    }

    @PostMapping("/add")
    public EngineResponse add(EngineRequest request) {
        return engineService.add(request);
    }

    @GetMapping("/get")
    public List<EngineResponse> getall(){
        return engineService.getAll();
    }

    @PostMapping("/edit")
    public EngineResponse edit(EngineRequest Request){
        return engineService.edit(Request);
    }

    @PostMapping("/del")
    public String del(Long id){
        engineService.delete(id);
        return id + " delete";
    }
}
