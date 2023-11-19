package by.pvt.core.repository;

import by.pvt.core.domain.Shopcart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


public interface ShopcartRepo extends JpaRepository<Shopcart, Long> {


    }
