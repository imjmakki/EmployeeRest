package app.employee.emprest.Service;

import app.employee.emprest.Domain.Employee;
import app.employee.emprest.Payload.Request.EmployeeRequest;
import app.employee.emprest.Payload.Response.EmployeeResponse;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public interface EmployeeService {
    EmployeeResponse createEmployee(EmployeeRequest employeeRequest);
    Optional<Employee> updateEmployee(Integer employeeId, EmployeeRequest employeeRequest);
    void deleteEmployee(Integer employeeId);
    Employee getASingleEmployee(Integer employeeId);
    List<Employee> getAllEmployee();
}
