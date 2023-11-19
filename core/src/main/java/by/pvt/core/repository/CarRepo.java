package by.pvt.core.repository;

import by.pvt.api.dto.carDTO.CarResponse;
import by.pvt.core.domain.shopDomain.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.util.List;

public interface CarRepo extends JpaRepository<Car, Long> {

}
