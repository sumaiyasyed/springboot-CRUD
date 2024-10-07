package com.springboot.springBoot_ng;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface EmployeeService {

    List<Employee> getEmployee();
    List<Employee> addEmployee(Employee employee);
}
