package com.example.sd18404.controller;

import com.example.sd18404.model.User;
import com.example.sd18404.model.UserCustom;
import jakarta.validation.Valid;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@Controller
public class UserController {

    ArrayList<User> listUser = new ArrayList<>();

    public UserController() {
        listUser.add(new User("PH123", "Nguyen Van A"));
        listUser.add(new User("PH124", "Nguyen Van B"));
        listUser.add(new User("PH125", "Nguyen Van C"));
    }

    @GetMapping("user")
    public String hienThi(Model model) {
        User user = new User("Ph123", "Nguyen Van B");
        model.addAttribute("user", user);
        return "user";
    }

    @GetMapping("/danh-sach")
    public String danhSach(Model model) {
        model.addAttribute("listUser", listUser);
        model.addAttribute("user", new User());
        return "user";
    }

    @GetMapping("/detail/{id}")
    public String detail(Model model,
                         @PathVariable("id") String id) {
        User userDetail = new User();
        for (User user : listUser) {
            if (user.getId().equals(id)) {
                userDetail = user;
            }
        }
        model.addAttribute("user", userDetail);

        return "detail";
    }

    @PostMapping(value = "/user/add")
    public String add(@Valid @ModelAttribute("user") User user,
                      BindingResult result) {
        if (result.hasErrors()) {
            return "user";
        } else {
            listUser.add(user);
            return "redirect:/danh-sach";
        }

    }

    @PostMapping(value = "/user/update/{id}")
    public String update(@PathVariable String id,
                         @ModelAttribute("userCustom") UserCustom userCustom) {
        for (User u : listUser) {
            if (u.getId().equals(id)) {
                u.setName(userCustom.getName());
            }
        }
        return "redirect:/danh-sach";
    }

}
