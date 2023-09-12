package by.pvt.core.service;

import by.pvt.core.domain.User;

import java.time.LocalDate;
import java.util.List;

public interface IUser {
    public void addUSer(User user);

    public List<User> getAllUsers();

    User searchUserById(long userId);

    public void delUser(long id);


    void editUser(User user, Integer age, double amount_sum, String firstName, String surname, String phone, LocalDate last_date_visit);
}
