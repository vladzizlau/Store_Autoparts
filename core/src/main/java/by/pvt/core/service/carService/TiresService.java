package by.pvt.core.service.carService;

import by.pvt.api.dto.carDTO.TiresRequest;
import by.pvt.api.dto.carDTO.TiresResponse;
import by.pvt.core.convert.TiresConvert;
import by.pvt.core.domain.shopDomain.Tires;
import by.pvt.core.repository.TiresRepository;
import by.pvt.core.service.interfaceService.ITires;

import java.util.Collections;
import java.util.List;

public class TiresService implements ITires {
    private final TiresRepository tiresRepository;
    private final TiresConvert tiresConvert;

    public TiresService() {
        tiresRepository = new TiresRepository();
        tiresConvert = new TiresConvert();
    }

    @Override
    public void add(TiresRequest tires) {
        tiresRepository.addTires(tiresConvert.toEntity(tires));
    }

    @Override
    public List<TiresResponse> getAll() {
        return tiresRepository.getAllTires();
    }

    @Override
    public TiresResponse searchById(long Id) {
        return tiresRepository.findById(Id);
    }


    @Override
    public void delete(long id) {
        tiresRepository.delTires(id);
    }

    @Override
    public void edit(TiresRequest t) {
        Tires tires = tiresConvert.toEntity(t);
        tires.setManufacturer(t.getManufacturer());
        tires.setName(t.getName());
        tires.setProfile_width(t.getProfile_width());
        tires.setProfile_height(t.getProfile_height());
        tires.setDiametr(t.getDiametr());
        tires.setSeason(t.getSeason());
        tires.setPrice(t.getPrice());
    }
}
