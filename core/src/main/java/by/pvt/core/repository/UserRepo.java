package by.pvt.core.repository;

import by.pvt.core.domain.shopDomain.AKB;
import org.springframework.data.jpa.repository.JpaRepository;
import by.pvt.core.domain.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserRepo extends JpaRepository<User, Long> {
    @Query(value = "select u from User u where u.email = :email")
    User getUserByEmail(@Param("email")String email);

    }
