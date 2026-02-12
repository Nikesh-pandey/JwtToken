package com.example.JwtDemo.Mapper;

import com.example.JwtDemo.Entity.User;
import com.example.JwtDemo.DTO.RegisterRequestDto;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {

    public User mapToEntity(RegisterRequestDto registerRequestDto) {
        return new User(
                registerRequestDto.getUsername(),
                registerRequestDto.getEmail(),
                registerRequestDto.getPassword()
        );
    }
}
