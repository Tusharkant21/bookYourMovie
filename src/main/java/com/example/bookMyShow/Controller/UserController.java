package com.example.bookMyShow.Controller;

import com.example.bookMyShow.Dtos.UserRequestDto;
import com.example.bookMyShow.Model.UserEntity;
import com.example.bookMyShow.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/user")
public class UserController {
    @Autowired
    UserService userService;

    @PostMapping("/add")
    public String addUser(@RequestBody UserRequestDto userRequestDto) throws Exception {
       return userService.addUserService(userRequestDto);

    }

    @GetMapping("/all_users")
    public List<UserEntity> getAllUsers() throws Exception{
        return userService.getAllUsers();
    }


}
