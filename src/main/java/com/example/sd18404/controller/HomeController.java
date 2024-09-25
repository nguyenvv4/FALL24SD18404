package com.example.sd18404.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class HomeController {

    //    @RequestMapping(value = "/hien-thi", method = RequestMethod.GET)
    @GetMapping("/hien-thi")
    public String hienThi(
//            @RequestParam("username") String username,
            @RequestParam("y") int y,
                          Model model) {
        int x = 1 + y;
        // => x= 6
        // java 4 => các request lấy được giá trị sẽ có kiểu String => part
        // Java 5 thì có thể gắn kiểu dữ liệu mặc định cho biến request đó
        model.addAttribute("hoTen", x);
        return "index";
    }
    // ví dụ pathvariable
    @GetMapping("/hien-thi1/{y}")
    public String hienThi1(
            @PathVariable("y") int y,
            Model model) {
        int x = 1 + y;

        model.addAttribute("hoTen", x);
        return "index";
    }
    //==> So sánh request param vs path variable
    // request: phân trang, các yêu cầu mun hiển thị thông tin lên url
    // path khi xoá, update, che giấu thông tin trên url


}
