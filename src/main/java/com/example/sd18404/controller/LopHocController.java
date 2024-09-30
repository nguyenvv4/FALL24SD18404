package com.example.sd18404.controller;

import com.example.sd18404.model.ILopHoc;
import com.example.sd18404.model.LopHoc;
import com.example.sd18404.model.LopHocTmp;
import com.example.sd18404.model.SinhVien;
import com.example.sd18404.repository.LopHocRepository;
import com.example.sd18404.repository.LopHocTmpRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class LopHocController {

    @Autowired
    private LopHocTmpRepo lopHocTmpRepo;

    @Autowired
    LopHocRepository lopHocRepository;

    @GetMapping("/lop-hoc")
    public String hienThi(Model model) {
        List<LopHocTmp> list = lopHocTmpRepo.getList();
        for (LopHocTmp lopHocTmp : list) {
            System.out.println(lopHocTmp.toString());
        }

        List<ILopHoc> lopHocList = lopHocRepository.getList();
        for (ILopHoc lopHoc : lopHocList) {
            System.out.println(lopHoc.getClassName() + "---" + lopHoc.getSiSo());
        }
        return "sinh-vien";
    }
}
