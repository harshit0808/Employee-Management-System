package com.example.EmployeeManagementSystem.mapper;

import com.example.EmployeeManagementSystem.dto.DtoEmployee;
import com.example.EmployeeManagementSystem.model.Employee;

public class MapperEmployee {

    public static Employee mapTOEmployee(DtoEmployee dtoEmployee) {
        return new Employee(
                dtoEmployee.getId(),
                dtoEmployee.getName(),
                dtoEmployee.getEmail(),
                dtoEmployee.getSalary(),
                dtoEmployee.getDepartment(),
                dtoEmployee.getPosition(),
                dtoEmployee.getBonus()
        );
    }

    public static DtoEmployee mapToDtoEmployee(Employee employee) {
        return new DtoEmployee(
                employee.getId(),
                employee.getName(),
                employee.getEmail(),
                employee.getSalary(),
                employee.getDepartment(),
                employee.getPosition(),
                employee.getBonus()
        );
    }
}