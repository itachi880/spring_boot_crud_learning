package com.itachi880.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.itachi880.demo.Models.UserModel;


@RestController
public class HelloWorldController {
    private UserModel userModel;
    public HelloWorldController(UserModel userModel){
this.userModel=userModel;
    }
    @GetMapping("/home")
    public String getMethodName() {
        System.out.println("breake");
        userModel.findAll().forEach(user -> {
            System.out.println(user.toString());
        });
        return "hello World";
    }
    
}
