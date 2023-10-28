package by.pvt.core.service.shopService;

import by.pvt.api.dto.shopDTO.UserRequest;
import by.pvt.api.dto.shopDTO.UserResponse;
import by.pvt.core.domain.User;
import by.pvt.core.mapper.UserMapper;
import by.pvt.core.repository.UserRepo;
import by.pvt.core.service.interfaceService.IUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService implements IUser {
@Autowired
    private UserRepo userRepository;
@Autowired
    private UserMapper userMapper;


    @Override
    public void addUser(UserRequest user) {
        userRepository.save(userMapper.toEntity(user));
    }

    @Override
    public List<UserResponse> getAllUsers() {
        return userMapper.toResponseList(userRepository.findAll());
    }

    @Override
    public UserResponse searchById(long userId) {
        Optional<User> byId = userRepository.findById(userId);
    return userMapper.toResponse(byId.get());
    }

    @Override
    public void delUser(long id) {
        userRepository.deleteById(id);
    }

    @Override
    public void editUser(UserRequest updateUser) {
        User user = userMapper.toEntity(updateUser);
        user.setAge(updateUser.getAge());
        user.setAmountSum(updateUser.getAmountSum());
        user.setFirstName(updateUser.getFirstName());
        user.setLastVisitDate(updateUser.getLastVisitDate());
        user.setPhoneNumber(updateUser.getPhoneNumber());
        user.setSurName(updateUser.getSurName());
        userRepository.save(user);
    }


}


