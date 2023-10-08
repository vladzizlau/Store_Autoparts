package by.pvt.core.repository.interfaceRepository;

import by.pvt.api.dto.shopDTO.UserResponse;
import by.pvt.core.domain.User;

import java.util.List;

public interface UserInterface
    {

    void addUser(User user);

    List<UserResponse> getAllUsers();

    UserResponse findById(Long userID);

    void updateUser(User user);

    void delUser(long id);
    }
