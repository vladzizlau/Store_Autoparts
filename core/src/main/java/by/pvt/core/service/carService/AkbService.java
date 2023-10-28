package by.pvt.core.service.carService;


import by.pvt.api.dto.carDTO.AkbRequest;
import by.pvt.api.dto.carDTO.AkbResponse;
import by.pvt.core.domain.shopDomain.AKB;
import by.pvt.core.mapper.AkbMapper;
import by.pvt.core.repository.AKBRepo;
import by.pvt.core.service.interfaceService.IAkbService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@Service
public class AkbService implements IAkbService {

    @Autowired
    private AkbMapper akbMapper;
    @Autowired
    private AKBRepo akbRepository;

public void add(AkbRequest request){
    akbRepository.save(akbMapper.toEntity(request));
}
    @Override
    public List<AkbResponse> getAll() {
        List<AKB> lstAKB = akbRepository.findAll();
        List<AkbResponse> lstR = akbMapper.toListResponse(lstAKB);
        return lstR;
    }
    @Override
    public List<AKB> getAKBbyVoltage(int volt){
        return akbRepository.findByVoltage(volt);
    }
//    @Override
    public List<AkbResponse> getAKBbyBatteryCapacity(Double capacity){
        List<AKB> lstAKB = akbRepository.findByBatteryCapacity(capacity);
        return akbMapper.toListResponse(lstAKB);
    }
    @Override
    public List<AKB> getAKBbyPrice(BigDecimal start, BigDecimal end) {
        return akbRepository.findAKBPriceAndPrice(start, end) ;
    }

    @Override
    public AkbResponse searchById(long id) {
        Optional<AKB> getById = akbRepository.findById(id);
        return akbMapper.toResponse(getById.get());
    }


    @Override
    public void delete(long id) {
        akbRepository.deleteById(id);
    }

    @Override
    public void edit(AkbRequest a) {
        AKB akb = akbMapper.toEntity(a);
        akb.setName(a.getName());
        akb.setVoltage(a.getVoltage());
        akb.setBatteryCapacity(a.getBatteryCapacity());
        akb.setElectric_current(a.getElectricCurrent());
        akb.setLength(a.getLength());
        akb.setWidth(a.getWidth());
        akb.setHeight(a.getHeight());
        akb.setPrice(a.getPrice());
        akbRepository.save(akb);
    }
}


