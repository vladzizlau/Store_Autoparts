package by.pvt.core.repository;

import by.pvt.core.domain.shopDomain.ManufacturerTires;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


public interface ManufacturerTiresRepo extends JpaRepository<ManufacturerTires, Long>
    {

    }
