package com.ehome2u.TicketingSystem.controller;

import com.ehome2u.TicketingSystem.entity.Employee;
import com.ehome2u.TicketingSystem.repository.EmployeeRepository;
import com.ehome2u.TicketingSystem.services.EmployeeService;
import com.ehome2u.TicketingSystem.services.EmployeeServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("employees")
public class EmployeeController {

    private EmployeeService employeeService;

    public EmployeeController(EmployeeService theEmployeeService){
        employeeService = theEmployeeService;
    }

    @GetMapping("/all")
    public String all(Model model){
        List<Employee> empList = employeeService.findAll();
        model.addAttribute("employees",empList);
        return "employees/employee-list";
    }
}
