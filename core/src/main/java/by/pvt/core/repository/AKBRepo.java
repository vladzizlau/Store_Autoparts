package by.pvt.core.repository;

import by.pvt.api.dto.carDTO.AkbResponse;
import by.pvt.core.domain.shopDomain.AKB;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.math.BigDecimal;
import java.util.List;

public interface AKBRepo extends JpaRepository<AKB, Long> {
    List<AKB> findByVoltage(int volt);
    @Query(value = "select a from AKB a where a.price > :start and a.price < :end")
    List<AKB> findAKBPriceAndPrice(@Param("start") BigDecimal start, @Param("end") BigDecimal end);
    @Query(value = "select a from AKB a where a.batteryCapacity = :capacity")
    List<AKB> findByBatteryCapacity(@Param("capacity") Double capacity);

    @Query(value = "select a from AKB a where a.batteryCapacity > :capacity and a.voltage < :volt")
    List<AKB> findAKBBatteryCapacityAndVoltage(@Param("capacity") Double capacity, @Param("volt") Integer volt);

    @Query(value = "select a from AKB a where a.code = :code")
    List<AKB> getTireByCode(@Param("code")Long code);
}
