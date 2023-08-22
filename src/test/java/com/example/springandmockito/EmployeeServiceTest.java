package com.example.springandmockito;

import com.example.springandmockito.model.Employee;
import com.example.springandmockito.service.EmployeeService;
import org.junit.jupiter.api.Test;

public class EmployeeServiceTest {
    EmployeeService employeeService = new EmployeeService();

    @Test
    void whenFullThenThrowException () {
        for (int i = 0; i < 5; i++) {
            employeeService.add(new Employee("name","second name", 1,1));
        }

    }




}