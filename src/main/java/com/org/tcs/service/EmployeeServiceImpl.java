package com.org.tcs.service;

import com.org.tcs.model.Employee;
import com.org.tcs.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService{
    @Autowired
    EmployeeRepo employeeRepo;
    @Override
    public void addEmployee(Employee employee) {
    employeeRepo.save(employee);
    }
}
