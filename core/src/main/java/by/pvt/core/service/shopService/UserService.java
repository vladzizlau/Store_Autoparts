package by.pvt.core.service.shopService;

import by.pvt.api.dto.shopDTO.UserRequest;
import by.pvt.api.dto.shopDTO.UserResponse;
import by.pvt.core.domain.User;
import by.pvt.core.mapper.UserMapper;
import by.pvt.core.repository.UserRepo;
import by.pvt.core.service.interfaceService.IUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class UserService implements IUser {
    private UserRepo userRepository;
    private UserMapper userMapper;

    @Autowired
    public UserService(UserRepo userRepository, UserMapper userMapper) {
        this.userRepository = userRepository;
        this.userMapper = userMapper;
    }


    @Override
    public UserResponse addUser(UserRequest userRequest) {
        User user = userMapper.toEntity(userRequest);
        user.setRole("Client");
        user.setLastVisitDate(LocalDate.now());
        return userMapper.toResponse(userRepository.save(user));
    }

    @Override
    public List<UserResponse> getAllUsers() {
        return userMapper.toResponseList(userRepository.findAll());
    }

    @Override
    public UserResponse searchById(long userId) {
        return userMapper.toResponse(getUserById(userId));
    }
    @Override
    public User getUserById(long userId) {
        Optional<User> byId = userRepository.findById(userId);
        return byId.get();
    }

    private UserResponse searchByEmail(String email) {
        List<UserResponse> urL = getAllUsers();
        for (UserResponse userResponse : urL) {
            if (Objects.equals(userResponse.getEmail(), email)) {
                return userResponse;
            }
        }
        return null;
    }

    @Override
    public void delUser(long id) {
        userRepository.deleteById(id);
    }

    @Override
    public void editUser(UserRequest updateUser) {
        userRepository.save(userMapper.toEntity(updateUser));
    }


    @Override
    public String validate(UserRequest request) {
        UserResponse userResponse = searchByEmail(request.getEmail());
        if (userResponse != null) {
            if (Objects.equals(userResponse.getPassword(), request.getPassword())) {
                return "Valid";
            }
        }
        return "Error validation";
    }




}
