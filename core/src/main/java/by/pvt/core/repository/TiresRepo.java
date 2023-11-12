package by.pvt.core.repository;

import by.pvt.api.dto.carDTO.TireResponse;
import by.pvt.core.domain.shopDomain.Tire;
import by.pvt.core.domain.shopDomain.TireType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.math.BigDecimal;
import java.util.List;

public interface TiresRepo extends JpaRepository<Tire, Long>{

@Query(value = "Select t from Tire t where t.diametr = :diametr")
    List<TireResponse> getTirebyDiametr(@Param("diametr") int d);
    @Query(value = "Select t from Tire t where t.profile_width = :w")
    List<TireResponse> getTirebyWidth(@Param("w") int w);
    @Query(value = "Select t from Tire t where t.profile_height = :h")
    List<TireResponse> getTirebyHeight(@Param("h") int h);
    @Query(value = "Select t from Tire t where t.season = :s")
    List<TireResponse> getTirebySeason(@Param("s") TireType type);
    @Query(value = "Select t from Tire t where t.price > :start and t.price < :end")
    List<TireResponse> getTireByPrice(@Param("start") BigDecimal start, @Param("end") BigDecimal end);
}
