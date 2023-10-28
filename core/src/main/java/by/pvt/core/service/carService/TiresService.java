package by.pvt.core.service.carService;

import by.pvt.api.dto.carDTO.TireRequest;
import by.pvt.api.dto.carDTO.TireResponse;
import by.pvt.core.domain.shopDomain.TireType;
import by.pvt.core.domain.shopDomain.Tire;
import by.pvt.core.mapper.TiresMapper;
import by.pvt.core.repository.TiresRepo;
import by.pvt.core.service.interfaceService.ITires;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@Service
public class TiresService implements ITires {
    @Autowired
    private TiresRepo tiresRepository;
    @Autowired
    private TiresMapper tiresMapper;


    @Override
    public void add(TireRequest tires) {
        tiresRepository.save(tiresMapper.toEntity(tires));
    }

    @Override
    public List<TireResponse> getAll() {
        return tiresMapper.toResponseList(tiresRepository.findAll());
    }

    @Override
    public TireResponse searchById(long Id) {
        Optional<Tire> byId = tiresRepository.findById(Id);
        return tiresMapper.toResponse(byId.get());
    }

    @Override
    public void delete(long id) {
        tiresRepository.deleteById(id);
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
        tiresRepository.save(tire);
    }

    @Override
    public List<TireResponse> getTirebyDiametr(int d) {
        return tiresRepository.getTirebyDiametr(d);
    }
    @Override
    public List<TireResponse> getTirebyWidth(int w) {
        return tiresRepository.getTirebyWidth(w);
    }
    @Override
    public List<TireResponse> getTirebyHeight(int h) {
        return tiresRepository.getTirebyHeight(h);
    }
    @Override
    public List<TireResponse> getTirebySeason(TireType type) {
        return tiresRepository.getTirebySeason(type);
    }
    @Override
    public List<TireResponse> getTirebyPrice(BigDecimal start, BigDecimal end) {
        return tiresRepository.getTireByPrice(start, end);
    }
}
