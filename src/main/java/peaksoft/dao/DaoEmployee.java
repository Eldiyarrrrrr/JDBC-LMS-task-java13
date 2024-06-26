package peaksoft.dao;

import lombok.*;
import peaksoft.model.Employee;
import peaksoft.model.Job;

import java.util.List;
import java.util.Map;

public interface DaoEmployee {
    void createEmployee();
    void addEmployee(Employee employee);
    void dropTable();
    void cleanTable();
    void updateEmployee(Long id,Employee employee);
    List<Employee> getAllEmployees();
    Employee findByEmail(String email);
    Map<Employee, Job> getEmployeeById(Long employeeId);
    List<Employee> getEmployeeByPosition(String position);
}

