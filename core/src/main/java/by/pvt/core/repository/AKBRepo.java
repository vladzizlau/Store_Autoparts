package by.pvt.core.repository;

import by.pvt.core.domain.shopDomain.AKB;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.math.BigDecimal;
import java.util.List;

public interface AKBRepo extends JpaRepository<AKB, Long> {
    List<AKB> findByVoltage(int volt);
    @Query(value = "select a from AKB a where a.price > :Start and a.price < :End")
    List<AKB> findAKBPriceAndPrice(@Param("Start") BigDecimal start, @Param("End") BigDecimal end);
    @Query(value = "select a from AKB a where a.batteryCapacity = :Capacity")
    List<AKB> findByBatteryCapacity(@Param("Capacity") Double capacity);


//    void addAKB(AKB akb);
//
//    List<AkbResponse> getAllAKB();
//
//    List<AKB> findAKBBYVoltage(int volt);
//
//    List<AkbResponse> getAKBbyBatteryCapacity(Double capacity);
//
//    List<AKB> getAKBbyPrice(BigDecimal start, BigDecimal end);
//
////    AkbResponse findById(Long akbID);
//
//    void updateAKB(AKB akb);
//
//    void delAKB(long id);
}
