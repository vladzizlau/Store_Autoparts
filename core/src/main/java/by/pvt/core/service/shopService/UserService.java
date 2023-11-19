package by.pvt.core.service.shopService;

import by.pvt.api.dto.shopDTO.UserRequest;
import by.pvt.api.dto.shopDTO.UserResponse;
import by.pvt.core.domain.User;
import by.pvt.core.mapper.UserMapper;
import by.pvt.core.repository.UserRepo;
import by.pvt.core.service.interfaceService.IUser;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class UserService implements IUser {
    private UserRepo userRepository;
    private UserMapper userMapper;
    private PasswordEncoder passwordEncoder;

    @Autowired
    public UserService(UserRepo userRepository, UserMapper userMapper, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.userMapper = userMapper;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public UserResponse addUser(UserRequest userRequest) {
        User user = userMapper.toEntity(userRequest);
        String hashpassword = passwordEncoder.encode(userRequest.getPassword());
        user.setPassword(hashpassword);
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

    @Override
    public UserResponse searchByEmail(String email) {
        return userMapper.toResponse(userRepository.getUserByEmail(email));
    }

    @Override
    public void delUser(long id) {
        userRepository.deleteById(id);
    }

    @Override
    public void editUser(UserRequest updateUser) {
        userRepository.save(userMapper.toEntity(updateUser));
    }


}
