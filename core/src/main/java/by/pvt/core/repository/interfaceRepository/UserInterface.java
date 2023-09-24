package by.pvt.core.repository.interfaceRepository;

import by.pvt.core.domain.User;

import java.util.List;

public interface UserInterface
    {

    void addUser(User user);

    List<User> getAllUsers();

    User findById(Long userID);

    void updateUser(User user);

    void delUser(long id);
    }
