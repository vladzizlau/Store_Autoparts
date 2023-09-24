package by.pvt.core.service.shopService;

import by.pvt.api.dto.shopDTO.UserRequest;
import by.pvt.api.dto.shopDTO.UserResponse;
import by.pvt.core.convert.UserConvert;
import by.pvt.core.domain.User;
import by.pvt.core.repository.UserRepository;
import by.pvt.core.service.interfaceService.IUser;

import java.time.LocalDate;
import java.util.List;

public class UserService implements IUser {

    private final UserRepository userRepository;
    private final UserConvert userConvert;

    public UserService() {
        userRepository = new UserRepository();
        userConvert = new UserConvert();
    }

    @Override
    public void addUser(UserRequest user) {
        userRepository.addUser(userConvert.userToEntity(user));
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.getAllUsers();
    }

    @Override
    public User searchById(long userId) {
        return userRepository.findById(userId);
    }

    public UserResponse getUserResponse(long id) {
        return userConvert.userToDTO(searchById(id));
    }

    @Override
    public void delUser(long id) {
        userRepository.delUser(id);
    }

    @Override
    public void editUser(UserRequest user, Integer age, double amount_sum, String firstName, String surname, String phone, LocalDate last_date_visit) {
        user.setAge(age);
        user.setAmountSum(amount_sum);
        user.setFirstName(firstName);
        user.setLastVisitDate(last_date_visit);
        user.setPhoneNumber(phone);
        user.setSurName(surname);
        userRepository.updateUser(userConvert.userToEntity(user));
    }


}


