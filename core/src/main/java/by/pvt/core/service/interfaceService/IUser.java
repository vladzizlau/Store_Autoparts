package by.pvt.core.service.interfaceService;

import by.pvt.api.dto.shopDTO.UserRequest;
import by.pvt.api.dto.shopDTO.UserResponse;
import by.pvt.core.domain.User;

import java.time.LocalDate;
import java.util.List;

public interface IUser {
    void addUser(UserRequest user);

    List<UserResponse> getAllUsers();

    UserResponse searchById(long userId);

    void delUser(long id);

    void editUser(UserRequest updateUser);
}
