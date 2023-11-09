package com.youtube.tutorial.ecommercebackend.api.controller.auth;


import com.youtube.tutorial.ecommercebackend.api.model.RegistrationBody;
import com.youtube.tutorial.ecommercebackend.service.UserService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthenticationController {


    private UserService userService;

    public AuthenticationController(UserService userService) {
        this.userService = userService;
    }
    @PostMapping("register")
    public  void  registerUser(@RequestBody RegistrationBody registrationBody){
        userService.registerUser(registrationBody);
    }
}

