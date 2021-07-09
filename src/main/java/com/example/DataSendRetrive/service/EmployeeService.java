package com.example.DataSendRetrive.service;

import com.example.DataSendRetrive.model.Employee;

import java.util.List;

public interface EmployeeService {
    Employee saveEmployee(Employee employee);
    List<Employee> getAllEmployees();

}
