package by.pvt.core.controller.productCrud;

import by.pvt.api.dto.carDTO.AkbRequest;
import by.pvt.api.dto.carDTO.AkbResponse;
import by.pvt.core.service.carService.AkbService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/akbedit")
@RequiredArgsConstructor
public class AkbController {

    private AkbService akbService;

    @Autowired
    public AkbController(AkbService akbService) {
        this.akbService = akbService;
    }

    @PostMapping("/add")
    public AkbResponse add(@Validated @RequestBody AkbRequest request) {
        return akbService.add(request);
    }

    @GetMapping("/get")
    public List<AkbResponse> getall(){
        return akbService.getAll();
    }

    @PostMapping("/edit")
    public AkbResponse edit(@Validated @RequestBody AkbRequest akbRequest){
        return akbService.edit(akbRequest);
    }

    @PostMapping("/del")
    public String del(Long id){
        akbService.delete(id);
        return id + " delete";
    }
}
