package com.example.sd18404.controller;

import com.example.sd18404.model.SinhVien;
import com.example.sd18404.model.User;
import com.example.sd18404.repository.SinhVienRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class SinhVienController {

    @Autowired
    SinhVienRepository sinhVienRepository;

    @GetMapping("/sinh-vien")
    public String hienThi(Model model) {
        List<SinhVien> list = sinhVienRepository.findAll();
        model.addAttribute("listSinhVien", list);
        return "sinh-vien";
    }
}
