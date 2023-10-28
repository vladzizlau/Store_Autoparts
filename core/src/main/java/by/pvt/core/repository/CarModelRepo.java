package by.pvt.core.repository;

import by.pvt.api.dto.carDTO.CarModelResponse;
import by.pvt.core.domain.shopDomain.CarModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CarModelRepo extends JpaRepository<CarModel, Long> {

    @Query(value = "select m from CarModel m where m.car = :id")
    List<CarModel> getModelByBrand(@Param("id") Long id);
}
