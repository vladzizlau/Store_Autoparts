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
public class UserRestController {

    private UserService userService;
    @Autowired
    public UserRestController(UserService userService) {
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
    public String addUser(@RequestBody UserRequest request)
    {
        userService.addUser(request);
        return "Register OK";
    }
        @PostMapping("/login")
    public String userLogin(@RequestBody UserRequest userRequest) {
        return userService.validate(userRequest);
    }




}