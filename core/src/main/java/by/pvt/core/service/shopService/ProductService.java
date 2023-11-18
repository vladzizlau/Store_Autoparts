package by.pvt.core.service.shopService;

import by.pvt.api.dto.carDTO.BodypartResponse;
import by.pvt.core.domain.shopDomain.BodyPart;
import by.pvt.core.service.carService.*;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.*;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
@NoArgsConstructor
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

    public List<?> getCategoryProds(String category) {
        return switch (category) {
            case ("akb") -> akbService.getAll();
            case ("bodypart") -> bodyPartService.getAll();
            case ("carlamp") -> carLampService.getAll();
            case ("engine") -> engineService.getAll();
            case ("tire") -> tiresService.getAll();
            default -> getAllprod();
        };
    }

    public List<List<?>> prodsForCar(Long id) { //Поиск и выдача запчастей по авто
        List<List<?>> list = new ArrayList<>();
        list.add(bodyPartService.searchByCarModel(id));
        list.add(engineService.searchByCarmodel(id));
        return list;
    }

    public List<List<?>> prodsByCode(Long id) {
        List<List<?>> all = new ArrayList<>();

        if (!akbService.getByCode(id).isEmpty()){
            all.add(akbService.getByCode(id));
        }
        else if (!bodyPartService.getByCode(id).isEmpty())
        {
            all.add(bodyPartService.getByCode(id));
        }
        else if (!carLampService.getByCode(id).isEmpty())
        {
            all.add(carLampService.getByCode(id));
        }
        else if (!engineService.getByCode(id).isEmpty())
        {
            all.add(engineService.getByCode(id));
        }
        else if (tiresService.getByCode(id) != null)
        {
            all.add(tiresService.getByCode(id));
        }
        return all;
    }


    public List<List<?>> allprodPages(int countpage, int size) {
        List<List<?>> list = getAllprod();
        List<List<?>> newlist = new ArrayList<List<?>>();

        if (countpage * size < list.size()) {
            for (int i = countpage * size - size; i < countpage * size; ) {
                newlist.add(list.get(i));
                i++;
            }
            return newlist;
        }
        return getAllprod();
    }


}
