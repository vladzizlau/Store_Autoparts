package by.pvt.core.service.carService;

import by.pvt.api.dto.carDTO.AkbRequest;
import by.pvt.api.dto.carDTO.AkbResponse;
import by.pvt.core.convert.AKBConvert;
import by.pvt.core.domain.shopDomain.AKB;
import by.pvt.core.repository.AKBRepository;
import by.pvt.core.service.interfaceService.Iakb;

import java.util.Collections;
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
    public List<AkbResponse> getAll() {
        return akbRepository.getAllAKB();
    }

    @Override
    public AkbResponse searchById(long id) {
        return akbRepository.findById(id);
    }


    @Override
    public void delete(long id) {
        akbRepository.delAKB(id);
    }

    @Override
    public void edit(AkbRequest a) {
        AKB akb = akbConvert.akbtoEntity(a);
        akb.setManufacturer(a.getManufacturer());
        akb.setName(a.getName());
        akb.setVoltage(a.getVoltage());
        akb.setBattery_capacity(a.getBattery_capacity());
        akb.setElectric_current(a.getElectric_current());
        akb.setLength(a.getLength());
        akb.setWidth(a.getWidth());
        akb.setHeight(a.getHeight());
        akb.setPrice(a.getPrice());
        akbRepository.updateAKB(akb);

    }
}


