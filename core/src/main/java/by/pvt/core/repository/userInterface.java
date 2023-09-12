package by.pvt.core.repository;

import by.pvt.core.domain.User;

import java.util.List;

public interface userInterface
    {
    void addUSer(User user);

    List<User> getAllUsers();

    User seacrhUserById(long userId);

    void delUser(long id);

    void editUser(User user);
    }
