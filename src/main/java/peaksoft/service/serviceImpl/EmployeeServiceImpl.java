package peaksoft.service.serviceImpl;

import peaksoft.config.JdbcConfig;
import peaksoft.dao.DaoEmployee;
import peaksoft.dao.daoImpl.EmployDaoImpl;
import peaksoft.model.Employee;
import peaksoft.model.Job;
import peaksoft.service.EmployeeService;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

public class EmployeeServiceImpl implements EmployeeService {
    DaoEmployee daoEmployee = new EmployDaoImpl();

    @Override
    public void createEmployee() {
        daoEmployee.createEmployee();
    }

    @Override
    public void addEmployee(Employee employee) {
        daoEmployee.addEmployee(employee);
    }

    @Override
    public void dropTable() {
        daoEmployee.dropTable();
    }

    @Override
    public void cleanTable() {
        daoEmployee.cleanTable();
    }

    @Override
    public void updateEmployee(Long id, Employee employee) {
        daoEmployee.updateEmployee(id,employee);
    }

    @Override
    public List<Employee> getAllEmployees() {
        return daoEmployee.getAllEmployees();
    }

    @Override
    public Employee findByEmail(String email) {
        return daoEmployee.findByEmail(email);
    }

    @Override
    public Map<Employee, Job> getEmployeeById(Long employeeId) {
        return daoEmployee.getEmployeeById(employeeId);
    }

    @Override
    public List<Employee> getEmployeeByPosition(String position) {
        return daoEmployee.getEmployeeByPosition(position);
    }
}
