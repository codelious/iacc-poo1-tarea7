package cl.iacc.rodrigoespinozatarea7.mocks;

import cl.iacc.rodrigoespinozatarea7.entity.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeData {

    private final List<Employee> employeeList;

    public EmployeeData() {
        this.employeeList = new ArrayList<>();
    }

    public Employee add(Employee employee) {
        employeeList.add(employee);
        return employee;
    }
    
    @SuppressWarnings("OptionalGetWithoutIsPresent")
    public Employee get(String id) {
        return employeeList.stream().filter(employee -> employee.getId().equalsIgnoreCase(id)).findFirst().get();
    }

    public List<Employee> getAll() {
        return employeeList;
    }

    public void delete(String id) {
        this.employeeList.remove(get(id));
    }
}
