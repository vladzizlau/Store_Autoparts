package by.pvt.core.service.interfaceService;

import by.pvt.api.dto.shopDTO.UserRequest;
import by.pvt.api.dto.shopDTO.UserResponse;
import by.pvt.core.domain.User;
import org.springframework.security.core.userdetails.UserDetails;

import java.time.LocalDate;
import java.util.List;

public interface IUser {
    UserResponse addUser(UserRequest user);

    List<UserResponse> getAllUsers();

    UserResponse searchById(long userId);

    User getUserById(long userId);

    User searchByEmail(String email);

    void delUser(long id);

    void editUser(UserRequest updateUser);

    UserDetails detailloadByEmail(String email);
}
