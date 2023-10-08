package by.pvt.core.service.shopService;

import by.pvt.api.dto.shopDTO.UserRequest;
import by.pvt.api.dto.shopDTO.UserResponse;
import by.pvt.core.convert.UserConvert;
import by.pvt.core.domain.User;
import by.pvt.core.repository.UserRepository;
import by.pvt.core.service.interfaceService.IUser;

import java.time.LocalDate;
import java.util.Collections;
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
    public List<UserResponse> getAllUsers() {
        return userRepository.getAllUsers();
    }

    @Override
    public UserResponse searchById(long userId) {
    return userRepository.findById(userId);   }

    @Override
    public void delUser(long id) {
        userRepository.delUser(id);
    }

    @Override
    public void editUser(UserRequest updateUser) {
        User user = userConvert.userToEntity(updateUser);
        user.setAge(updateUser.getAge());
        user.setAmountSum(updateUser.getAmountSum());
        user.setFirstName(updateUser.getFirstName());
        user.setLastVisitDate(updateUser.getLastVisitDate());
        user.setPhoneNumber(updateUser.getPhoneNumber());
        user.setSurName(updateUser.getSurName());
        userRepository.updateUser(user);
    }


}


