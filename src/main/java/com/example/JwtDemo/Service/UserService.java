package com.example.JwtDemo.Service;

import com.example.JwtDemo.Config.JwtService;
import com.example.JwtDemo.DTO.RegisterRequestDto;
import com.example.JwtDemo.Entity.User;
import com.example.JwtDemo.Mapper.UserMapper;
import com.example.JwtDemo.Repository.UserRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import com.example.JwtDemo.Config.ApplicationConfig;
import com.example.JwtDemo.DTO.LoginRequestDto;
import com.example.JwtDemo.DTO.jwtDto;
@Service
public class UserService {

    private final UserMapper userMapper;
    private final UserRepository userRepository;
private final PasswordEncoder passwordEncoder;
private final UserDetailsService userDetailsService;
private final JwtService jwtService;
    public UserService(PasswordEncoder passwordEncoder,UserMapper userMapper, UserRepository userRepository, UserDetailsService userDetailsService,JwtService jwtService) {
        this.userMapper=userMapper;
        this.userRepository=userRepository;
        this.passwordEncoder=passwordEncoder;
        this.userDetailsService=userDetailsService;
        this.jwtService=jwtService;
    }


    public String getData(RegisterRequestDto registerRequestDto){
String change=passwordEncoder.encode(registerRequestDto.getPassword());
registerRequestDto.setPassword(change);
    User user=userMapper.mapToEntity(registerRequestDto);
    userRepository.save(user);
        return "User Registered Successfully";
    }

    public jwtDto getLogin(LoginRequestDto loginRequestDto){
String data=loginRequestDto.getEmail();
        UserDetails userDetails=userDetailsService.loadUserByUsername(data);
if(passwordEncoder.matches(loginRequestDto.getPassword(), userDetails.getPassword())){
    String token=jwtService.generateToken(userDetails);
    return new jwtDto("Login Successful!", token);}
else {
    return new jwtDto("Invalid Password!", null);}
}
    }



