package by.pvt.core.repository;

import by.pvt.api.dto.carDTO.CarLampResponse;
import by.pvt.core.domain.shopDomain.CarLamp;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.query.Param;

import java.math.BigDecimal;
import java.util.List;

public interface CarLampRepo extends JpaRepository<CarLamp, Long> {
    @Query(value = "select l from CarLamp l where l.power = :power")
    List<CarLamp> getCarLampByPower(@Param("power") int power);

    @Query(value = "select l from CarLamp l where l.socket = :socket")
    List<CarLamp> getCarLampBySocket(@Param("socket") String socket);
    @Query(value = "select l from CarLamp l where l.cost > :start and l.cost < :end")
    List<CarLamp> getCarLampByPrice(BigDecimal start, BigDecimal end);
    @Query(value = "select l from CarLamp l where l.code = :code")
    List<CarLamp> getTireByCode(@Param("code")Long code);
}
