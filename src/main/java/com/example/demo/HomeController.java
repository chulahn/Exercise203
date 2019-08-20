package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {

    @GetMapping("/songform")
    public String loadFormPage(Model model) {
        model.addAttribute("song", new Song());
        return "songform";
    }

    @PostMapping("/songform")
    public String loadFromPage(@ModelAttribute Song song, Model model) {
        model.addAttribute("song", song);
        return "confirmsong";
    }

    @GetMapping("/employeeform")
    public String loadEmployeeFormPage(Model model) {
        model.addAttribute("employee", new Employee());
        return "employeeform";
    }

    @PostMapping("/employeeform")
    public String loadEmployeeFromPage(@ModelAttribute Employee employee, Model model) {
        model.addAttribute("employee", employee);
        return "confirmemployee";
    }
}
