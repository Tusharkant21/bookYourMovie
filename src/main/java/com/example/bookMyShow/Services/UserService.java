package com.example.bookMyShow.Services;

import com.example.bookMyShow.Dtos.UserRequestDto;
import com.example.bookMyShow.Model.TheaterEntity;
import com.example.bookMyShow.Model.UserEntity;
import com.example.bookMyShow.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;
    public String addUserService(UserRequestDto userRequestDto) throws Exception{
        UserEntity userEntity = UserEntity.builder().name(userRequestDto.getName()).mobile(userRequestDto.getMobile()).build();
        userRepository.save(userEntity);
        return "user added Succesfully";
    }

    public List<UserEntity> getAllUsers() throws Exception{
        return (List<UserEntity>) userRepository.findAll();

    }
}
