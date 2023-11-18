package by.pvt.core.controller;



import by.pvt.api.dto.shopDTO.UserRequest;
import by.pvt.api.dto.shopDTO.UserResponse;
import by.pvt.core.service.shopService.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/u")
@RequiredArgsConstructor
public class UserController {

    private UserService userService;
    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }
    @GetMapping("/getall")
    public List<UserResponse> getALL() {
        return userService.getAllUsers();
    }

    @PostMapping("/byid={id}")
    public UserResponse getuser(@PathVariable("id") Long id){
        return userService.searchById(id);
    }

    @PostMapping("/del={id}")
    public void deluser(@PathVariable("id") Long id){
        userService.delUser(id);
    }
    @PostMapping("/reg")
    public UserResponse addUser(@RequestBody UserRequest request)
    {
        return userService.addUser(request);
    }
        @PostMapping("/login")
    public String userLogin(@RequestBody UserRequest userRequest) {
        return userService.validate(userRequest);
    }




}