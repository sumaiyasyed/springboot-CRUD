package com.springboot.springBoot_ng;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeFromMem implements EmployeeService{
    EmployeeMem memory;

    public EmployeeFromMem(EmployeeMem memory){
        this.memory = memory;
    }

    @Override
    public List<Employee> getEmployee(){
       return  memory.getEmployee();
    }

    @Override
    public  List<Employee> addEmployee(Employee employee){
        return memory.addEmployee(employee);
    }
}
