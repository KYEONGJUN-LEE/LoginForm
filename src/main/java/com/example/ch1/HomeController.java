package com.example.ch1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

// 1. 원격 프로그램으로 등록
@Controller
public class HomeController {
    // 2. URL과 메서드를 연결
    @GetMapping("/")
    public String main() {
        return "login";
    }
}
