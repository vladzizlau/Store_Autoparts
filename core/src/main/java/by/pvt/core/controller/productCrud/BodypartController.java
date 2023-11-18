package by.pvt.core.controller.productCrud;


import by.pvt.api.dto.carDTO.BodypartRequest;
import by.pvt.api.dto.carDTO.BodypartResponse;
import by.pvt.core.service.carService.BodyPartService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/bodypartedit")
@RequiredArgsConstructor
public class BodypartController {

    private BodyPartService bodyPartService;

    @Autowired
    public BodypartController(BodyPartService bodyPartService) {
        this.bodyPartService = bodyPartService;
    }

    @PostMapping("/add")
    public BodypartResponse add(BodypartRequest request) {
        return bodyPartService.add(request);
    }

    @GetMapping("/get")
    public List<BodypartResponse> getall(){
        return bodyPartService.getAll();
    }

    @PostMapping("/edit")
    public BodypartResponse edit(BodypartRequest Request){
        return bodyPartService.edit(Request);
    }

    @PostMapping("/del")
    public String del(Long id){
        bodyPartService.delete(id);
        return id + " delete";
    }


}
