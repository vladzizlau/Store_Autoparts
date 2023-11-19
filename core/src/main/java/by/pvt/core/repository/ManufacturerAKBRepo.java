package by.pvt.core.repository;

import by.pvt.core.domain.shopDomain.ManufacturerAKB;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


public interface ManufacturerAKBRepo extends JpaRepository<ManufacturerAKB, Long> {
}
