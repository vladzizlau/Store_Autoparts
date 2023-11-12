package by.pvt.core.service.shopService;

import by.pvt.core.service.carService.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Slice;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {
    private AkbService akbService;
    private BodyPartService bodyPartService;
    private CarLampService carLampService;
    private CarService carService;
    private EngineService engineService;
    private ManufacturerAKBService manufacturerAKBService;
    private ManufacturerTiresService manufacturerTiresService;
    private TiresService tiresService;

    @Autowired
    public ProductService(AkbService akbService, BodyPartService bodyPartService, CarLampService carLampService, CarService carService, EngineService engineService, ManufacturerAKBService manufacturerAKBService, ManufacturerTiresService manufacturerTiresService, TiresService tiresService) {
        this.akbService = akbService;
        this.bodyPartService = bodyPartService;
        this.carLampService = carLampService;
        this.carService = carService;
        this.engineService = engineService;
        this.manufacturerAKBService = manufacturerAKBService;
        this.manufacturerTiresService = manufacturerTiresService;
        this.tiresService = tiresService;
    }

    public List<List<?>> getAllprod() {
        return Arrays.asList(akbService.getAll(), bodyPartService.getAll(), carLampService.getAll(), carService.getAllCar(), carService.getAllModel(), engineService.getAll(), manufacturerAKBService.getAll(), manufacturerTiresService.getAll(), tiresService.getAll());
    }

//    public List<List<?>> allprodPages(){
//        List<List<?>> list = getAllprod();
//        List<List<?>> newlist = null;
//        int count = list.size();
//
//        for(int i = 0; i < 10; i++)
//        {
//           newlist.add(list.get(i));
//        }



//    }

}
