package by.pvt.core.repository;

import by.pvt.api.dto.carDTO.EngineResponse;
import by.pvt.core.domain.shopDomain.Engine;
import by.pvt.core.domain.shopDomain.EngineType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.math.BigDecimal;
import java.util.List;

public interface EngineRepo extends JpaRepository<Engine, Long> {

    @Query(value = "Select e from Engine e where e.cost > :start and e.cost < :end")
    List<Engine> getEngineByPrice(@Param("start") BigDecimal start, @Param("end") BigDecimal end);

    @Query(value = "select e from Engine e where e.engineCapacity = :capacity")
    List<EngineResponse> getEngineByCapacity(@Param("capacity") Double capacity);
    @Query(value = "select e from Engine e where e.type = :type")
    List<EngineResponse> getEngineByType(@Param("type") EngineType type);
}
