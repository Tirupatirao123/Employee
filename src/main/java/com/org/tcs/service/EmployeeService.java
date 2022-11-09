package com.org.tcs.service;

import com.org.tcs.model.Employee;
import org.springframework.web.bind.annotation.RequestBody;

public interface EmployeeService {
    public void addEmployee( Employee employee);
}
