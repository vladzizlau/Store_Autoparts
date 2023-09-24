package by.pvt.core.service.carService;

import by.pvt.api.dto.carDTO.TiresRequest;
import by.pvt.api.dto.carDTO.TiresResponse;
import by.pvt.core.convert.TiresConvert;
import by.pvt.core.domain.shopDomain.Tires;
import by.pvt.core.repository.TiresRepository;
import by.pvt.core.service.interfaceService.ITires;

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
    public List<Tires> getAll() {
        return tiresRepository.getAllTires();
    }

    @Override
    public Tires searchById(long Id) {
        return tiresRepository.findById(Id);
    }

    public TiresResponse getTiresResponse(long id) {
        return tiresConvert.toDTO(searchById(id));
    }

    @Override
    public void delete(long id) {
        tiresRepository.delTires(id);
    }

    @Override
    public void edit(TiresRequest tires, String manufacturer, String name, double profile_width, double profile_height, int diametr, String season, double price) {
        tires.setManufacturer(manufacturer);
        tires.setName(name);
        tires.setProfile_width(profile_width);
        tires.setProfile_height(profile_height);
        tires.setDiametr(diametr);
        tires.setSeason(season);
        tires.setPrice(price);
    }
}
