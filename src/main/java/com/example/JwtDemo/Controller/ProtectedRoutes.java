package com.example.JwtDemo.Controller;
import com.example.JwtDemo.Repository.UserRepository;
import com.example.JwtDemo.DTO.RegisterRequestDto;
import com.example.JwtDemo.Service.UserService;
import com.sun.tools.jconsole.JConsoleContext;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.JwtDemo.DTO.LoginRequestDto;
import com.example.JwtDemo.DTO.jwtDto;
@RestController
public class ProtectedRoutes {

    private final UserService userService;
    public ProtectedRoutes(UserService userService){
        this.userService=userService;
    }
@GetMapping("/admin")
    public String returnString(){
        return "This is the protected route";
    }


}
