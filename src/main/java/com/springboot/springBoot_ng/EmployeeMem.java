package com.springboot.springBoot_ng;


import java.util.ArrayList;
import java.util.List;

public class EmployeeMem {

    final List<Employee> EMPLOYEES = new ArrayList<Employee>();

    public List<Employee> getEmployee(){
        return EMPLOYEES;
    }

    public List<Employee> addEmployee(Employee employee)
    {
        EMPLOYEES.add(employee);
        return EMPLOYEES;
    }
}
