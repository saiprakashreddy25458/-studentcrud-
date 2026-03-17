package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EmployeeController {

    @GetMapping("/employee")
    public String showEmployee(Model model) {

        Employee emp = new Employee(101, "Anand", "CSE");

        model.addAttribute("emp", emp);

        return "employee";
    }
}