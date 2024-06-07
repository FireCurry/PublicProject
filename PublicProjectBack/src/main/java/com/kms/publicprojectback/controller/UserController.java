package com.kms.publicprojectback.controller;

import com.kms.publicprojectback.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("user")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping("")
    public String index() {
        return "Hello World";
    }

    @PostMapping("/login")
    public String login() {
        return "Hello World";
    }

    @GetMapping("idCheck")
    public String idCheck(String username) {

        String message = null;

        if(userService.idCheck(username)){
            message = "이미 존재하는 아이디입니다.";
        } else {
            message = "사용할 수 있는 아이디입니다.";
        }

        return message;
    }
}
