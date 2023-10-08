package by.pvt.core;

import by.pvt.api.dto.carDTO.AkbResponse;
import by.pvt.api.dto.carDTO.CarModelResponse;
import by.pvt.api.dto.carDTO.TireResponse;
import by.pvt.core.domain.shopDomain.AKB;
import by.pvt.core.domain.shopDomain.CarModel;
import by.pvt.core.domain.shopDomain.Engine;
import by.pvt.core.domain.shopDomain.TireType;
import by.pvt.core.repository.CarModelRepository;
import by.pvt.core.service.carService.AkbService;
import by.pvt.core.service.carService.CarService;
import by.pvt.core.service.carService.EngineService;
import by.pvt.core.service.carService.TiresService;

import java.math.BigDecimal;
import java.util.List;

public class Dz_20 {
    private final CarService carService;
    private final AkbService akbService;
    private final EngineService engineService;
    private final TiresService tiresService;

    public Dz_20() {
        carService = new CarService();
        akbService = new AkbService();
        engineService = new EngineService();
        tiresService = new TiresService();
    }

    public CarModel getModelById(Long modelId) {return carService.modelSearchById(modelId);}

    public List<AKB> getAKBbyVoltage(int volt) {
       return akbService.getAKBbyVoltage(volt);
    }

    public List<AKB> getAKBbyPrice(BigDecimal start, BigDecimal end) {
       return akbService.getAKBbyPrice(start, end);
    }

    public List<Engine> getEngineByPrice(BigDecimal start, BigDecimal end) {
        return engineService.getEngineByPrice(start, end);
    }

    //C join
    public List<CarModel> getModelByBrand(Long brandId) {
        return carService.getModelByBrand(brandId);
    }
//Detached
    public List<TireResponse> getTirebySeason(TireType type) {
        return tiresService.getTirebySeason(type);
    }
}
