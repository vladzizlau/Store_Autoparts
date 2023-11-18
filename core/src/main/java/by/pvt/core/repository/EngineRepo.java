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
    List<Engine> getEngineByCapacity(@Param("capacity") Double capacity);
    @Query(value = "select e from Engine e where e.type = :type")
    List<Engine> getEngineByType(@Param("type") EngineType type);

    @Query(value = "select e from Engine e where e.carModel.id = :id")
    List<Engine> getEngineByCarModel(@Param("id") Long id);

    @Query(value = "select e from Engine e where e.code = :code")
    List<Engine> getTireByCode(@Param("code")Long code);
}
