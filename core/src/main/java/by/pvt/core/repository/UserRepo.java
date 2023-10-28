package by.pvt.core.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import by.pvt.core.domain.User;

public interface UserRepo extends JpaRepository<User, Long> {

    }
