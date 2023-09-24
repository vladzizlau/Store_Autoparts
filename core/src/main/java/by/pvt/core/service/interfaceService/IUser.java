package by.pvt.core.service.interfaceService;

import by.pvt.api.dto.shopDTO.UserRequest;
import by.pvt.core.domain.User;

import java.time.LocalDate;
import java.util.List;

public interface IUser {
    void addUser(UserRequest user);

    List<User> getAllUsers();

    User searchById(long userId);

    void delUser(long id);

    void editUser(UserRequest user, Integer age, double amount_sum, String firstName, String surname, String phone, LocalDate last_date_visit);
}
