package by.pvt.core.repository;

import by.pvt.api.dto.carDTO.TireResponse;
import by.pvt.core.domain.shopDomain.Tire;
import by.pvt.core.domain.shopDomain.TireType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.math.BigDecimal;
import java.util.List;

public interface TiresRepo extends JpaRepository<Tire, Long> {

    @Query(value = "Select t from Tire t where t.diametr = :diametr")
    List<Tire> getTirebyDiametr(@Param("diametr") int d);

    @Query(value = "Select t from Tire t where t.profile_width = :w")
    List<Tire> getTirebyWidth(@Param("w") int w);

    @Query(value = "Select t from Tire t where t.profile_height = :h")
    List<Tire> getTirebyHeight(@Param("h") int h);

    @Query(value = "Select t from Tire t where t.season = :s")
    List<Tire> getTirebySeason(@Param("s") TireType type);

    @Query(value = "Select t from Tire t where t.price > :start and t.price < :end")
    List<Tire> getTireByPrice(@Param("start") BigDecimal start, @Param("end") BigDecimal end);

    @Query(value = "Select t from Tire t where t.code = :code")
    List<Tire> getTireByCode(@Param("code") Long code);
}
