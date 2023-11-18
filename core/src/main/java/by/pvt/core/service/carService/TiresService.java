package by.pvt.core.service.carService;

import by.pvt.api.dto.carDTO.TireRequest;
import by.pvt.api.dto.carDTO.TireResponse;
import by.pvt.core.domain.shopDomain.Tire;
import by.pvt.core.domain.shopDomain.TireType;
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
    private TiresRepo tiresRepository;
    private TiresMapper tiresMapper;

    @Autowired
    public TiresService(TiresRepo tiresR, TiresMapper tiresM) {
        this.tiresRepository = tiresR;
        this.tiresMapper = tiresM;
    }

    @Override
    public TireResponse add(TireRequest tires) {
        return tiresMapper.toResponse(tiresRepository.save(tiresMapper.toEntity(tires)));
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
    public TireResponse edit(TireRequest t) {
        return tiresMapper.toResponse(tiresRepository.save(tiresMapper.toEntity(t)));
    }

    @Override
    public List<TireResponse> getTirebyDiametr(int d) {
        return tiresMapper.toResponseList(tiresRepository.getTirebyDiametr(d));
    }

    @Override
    public List<TireResponse> getTirebyWidth(int w) {
        return tiresMapper.toResponseList(tiresRepository.getTirebyWidth(w));
    }

    @Override
    public List<TireResponse> getTirebyHeight(int h) {
        return tiresMapper.toResponseList(tiresRepository.getTirebyHeight(h));
    }

    @Override
    public List<TireResponse> getTirebySeason(TireType type) {
        return tiresMapper.toResponseList(tiresRepository.getTirebySeason(type));
    }

    @Override
    public List<TireResponse> getTirebyPrice(BigDecimal start, BigDecimal end) {
        return tiresMapper.toResponseList(tiresRepository.getTireByPrice(start, end));
    }

    @Override
    public List<TireResponse> getByCode(Long code) {
        return tiresMapper.toResponseList(tiresRepository.getTireByCode(code));
    }
}
