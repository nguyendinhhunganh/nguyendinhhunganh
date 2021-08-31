package case_study.services;

import case_study.models.Employee;

public interface EmployeeService extends Service  {
    public Employee isEmployee(int employeeCode);
}
