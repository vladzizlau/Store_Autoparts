package by.pvt.core.service.carService;

import by.pvt.api.dto.carDTO.TireRequest;
import by.pvt.api.dto.carDTO.TireResponse;
import by.pvt.core.convert.TiresConvert;
import by.pvt.core.domain.shopDomain.TireType;
import by.pvt.core.domain.shopDomain.Tire;
import by.pvt.core.mapper.TiresMapper;
import by.pvt.core.repository.TiresRepository;
import by.pvt.core.service.interfaceService.ITires;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
@Service
public class TiresService implements ITires {
    private final TiresRepository tiresRepository;
    private TiresMapper tiresMapper;

    public TiresService(TiresRepository tr) {
        tiresRepository = tr;
    }

    @Override
    public void add(TireRequest tires) {
        tiresRepository.addTires(tiresMapper.toEntity(tires));
    }

    @Override
    public List<TireResponse> getAll() {
        return tiresRepository.getAllTires();
    }

    @Override
    public TireResponse searchById(long Id) {
        return tiresRepository.findById(Id);
    }


    @Override
    public void delete(long id) {
        tiresRepository.delTires(id);
    }

    @Override
    public void edit(TireRequest t) {
        Tire tire = tiresMapper.toEntity(t);
        tire.setName(t.getName());
        tire.setProfile_width(t.getProfileWidth());
        tire.setProfile_height(t.getProfileHeight());
        tire.setDiametr(t.getDiametr());
        tire.setSeason(TireType.valueOf(t.getSeason()));
        tire.setPrice(t.getPrice());
    }


    public List<TireResponse> getTirebyDiametr(int d) {
        return tiresRepository.getTirebyDiametr(d);
    }

    public List<TireResponse> getTirebyWidth(int w) {
        return tiresRepository.getTirebyWidth(w);
    }

    public List<TireResponse> getTirebyHeight(int h) {
        return tiresRepository.getTirebyHeight(h);
    }

    public List<TireResponse> getTirebySeason(TireType type) {
        return tiresRepository.getTirebySeason(type);
    }

    public List<TireResponse> getTirebyPrice(BigDecimal start, BigDecimal end) {
        return tiresRepository.getTireByPrice(start, end);
    }
}
