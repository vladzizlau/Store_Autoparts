package by.pvt.core.repository;

import by.pvt.api.dto.carDTO.BodypartResponse;
import by.pvt.core.domain.shopDomain.BodyPart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.math.BigDecimal;
import java.util.List;

public interface BodyPartRepo extends JpaRepository<BodyPart, Long> {

    @Query(value = "select b from BodyPart b where b.cost > :start and b.cost < :end")
    List<BodypartResponse> getBydypartByPrice(@Param("start") BigDecimal start,@Param("end") BigDecimal end);
}
