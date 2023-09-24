package by.pvt.core.service.carService;

import by.pvt.api.dto.carDTO.AkbRequest;
import by.pvt.api.dto.carDTO.AkbResponse;
import by.pvt.core.convert.AKBConvert;
import by.pvt.core.domain.shopDomain.AKB;
import by.pvt.core.repository.AKBRepository;
import by.pvt.core.service.interfaceService.Iakb;

import java.util.List;

public class AkbService implements Iakb {

    private final AKBRepository akbRepository;
    private final AKBConvert akbConvert;

    public AkbService() {
        akbRepository = new AKBRepository();
        akbConvert = new AKBConvert();
    }


    @Override
    public void add(AkbRequest akb) {
        akbRepository.addAKB(akbConvert.akbtoEntity(akb));
    }

    @Override
    public List<AKB> getAll() {
        return akbRepository.getAllAKB();
    }

    @Override
    public AKB searchById(long id) {
        return akbRepository.findById(id);
    }

    public AkbResponse getAKBResponse(long id) {
        return akbConvert.toDTO(searchById(id));
    }

    @Override
    public void delete(long id) {
        akbRepository.delAKB(id);
    }

    @Override
    public void edit(AkbRequest akb, String manufacturer, String name, int voltage, double battery_capacity, int electric_current, int length, int width, int height, double price) {
        akb.setManufacturer(manufacturer);
        akb.setName(name);
        akb.setVoltage(voltage);
        akb.setBattery_capacity(battery_capacity);
        akb.setElectric_current(electric_current);
        akb.setLength(length);
        akb.setWidth(width);
        akb.setHeight(height);
        akb.setPrice(price);
        akbRepository.updateAKB(akbConvert.akbtoEntity(akb));

    }
}


