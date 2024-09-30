package com.example.sd18404.controller;

import com.example.sd18404.model.LopHoc;
import com.example.sd18404.model.SinhVien;
import com.example.sd18404.model.User;
import com.example.sd18404.repository.LopHocRepository;
import com.example.sd18404.repository.SinhVienRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class SinhVienController {

    @Autowired
    SinhVienRepository sinhVienRepository;

    @Autowired
    LopHocRepository lopHocRepository;

    @GetMapping("/sinh-vien")
    public String hienThi(Model model) {
        List<SinhVien> list = sinhVienRepository.findAll();
        model.addAttribute("listSinhVien", list);
        List<LopHoc> listClass = lopHocRepository.findAll();
        model.addAttribute("listClass", listClass);
        return "sinh-vien";
    }

    @PostMapping("/sinh-vien/add")
    public String add(Model model, @ModelAttribute SinhVien sinhVien) {
        sinhVienRepository.save(sinhVien);
        return "redirect:/sinh-vien";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable("id") Integer id) {
        sinhVienRepository.deleteById(id);
        return "redirect:/sinh-vien";
    }

    @GetMapping("/page")
    public String phanTrang(Model model,
                            @RequestParam(value = "page", defaultValue = "0") Integer page,
                            @RequestParam(value = "size", defaultValue = "3") Integer size) {

        Pageable pageable = PageRequest.of(page, size);
        Page<SinhVien> list = sinhVienRepository.findAll(pageable);
        model.addAttribute("listSinhVien", list.getContent());
        return "/sinh-vien";
    }
}
