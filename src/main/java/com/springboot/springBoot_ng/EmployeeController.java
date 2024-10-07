package com.springboot.springBoot_ng;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class EmployeeController {
    List<Employee> employee;
    EmployeeService employeeService;

    public  EmployeeController(EmployeeService employeeService) {
           this.employeeService = employeeService;
    }

    @GetMapping
    public  List<Employee> getEmployeeList(){
        return employeeService.getEmployee();
    }

    @PostMapping
    public  List<Employee> addEmployee(@RequestBody Employee employee){
        return employeeService.addEmployee(employee);
    }
}
