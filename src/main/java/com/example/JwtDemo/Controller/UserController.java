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
@RequestMapping("/api/auth")
public class UserController {

    private final UserService userService;
    public UserController(UserService userService){
        this.userService=userService;
    }

@PostMapping("/add")
public ResponseEntity<String> postData(@RequestBody  RegisterRequestDto registerRequestDto){

    return new ResponseEntity<>(userService.getData(registerRequestDto), HttpStatus.CREATED);
    }

    @PostMapping("/login")
    public jwtDto login(@RequestBody LoginRequestDto loginRequestDto) {
        return userService.getLogin(loginRequestDto);
    }

    @PostMapping("/getData")
    public String getString(){
        return "Authenticated";
    }
}





