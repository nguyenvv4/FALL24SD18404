package com.example.sd18404.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {

    @GetMapping("/login")
    public String hienThi(){
        return "login";
    }

    @PostMapping("/login")
    public String login(){
        System.out.println("Da chay vao day");
        return "login";
    }

    //=>Ket luan

    // 1 đường dẫn có thể có 2 method khác nhau

}
