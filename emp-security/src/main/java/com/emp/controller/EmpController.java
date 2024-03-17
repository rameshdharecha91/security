package com.emp.controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/emp")
public class EmpController {

    @GetMapping("/getemp")
    public String createEmp()
    {
        return "Welcome to Java";
    }
}
