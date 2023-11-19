package by.pvt.core.controller;

import by.pvt.api.dto.shopDTO.UserRequest;
import by.pvt.api.dto.shopDTO.UserResponse;
import by.pvt.core.service.shopService.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("new")
@RequiredArgsConstructor
public class NotAuthorized {
    private UserService userService;

    @Autowired
    public NotAuthorized(UserService userService) {
        this.userService = userService;
    }

    //Регистрация пользователя
    @PostMapping("/reg")
    public UserResponse addUser(@Validated @RequestBody UserRequest request) {
        return userService.addUser(request);
    }
}
