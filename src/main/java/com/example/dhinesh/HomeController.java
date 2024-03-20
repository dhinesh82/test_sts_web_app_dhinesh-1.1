package com.example.dhinesh;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
 
@Controller
public class HomeController {
 
@GetMapping(value = "/")
public String home() {
return "index";
}

@PostMapping("/add")
public String addNumbers(@RequestParam("num1") int num1, @RequestParam("num2") int num2, Model model) {
    int result = num1 + num2;
    model.addAttribute("result", result);
    return "result";
}
 
}
