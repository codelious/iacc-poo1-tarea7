package cl.iacc.rodrigoespinozatarea7.repository;

import cl.iacc.rodrigoespinozatarea7.mocks.EmployeeData;
import cl.iacc.rodrigoespinozatarea7.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeRepositoryImpl implements EmployeeRepository {

    final EmployeeData employeeData;
    @Autowired
    public EmployeeRepositoryImpl(EmployeeData employeeData) {
        this.employeeData = employeeData;
    }

    @Override
    public Employee create(Employee employee) {
        return employeeData.add(employee);
    }

    @Override
    public Employee findById(String id) {
        return employeeData.get(id);
    }

    @Override
    public List<Employee> findAll() {
        return employeeData.getAll();
    }

    @Override
    public void remove(String id) {
        employeeData.delete(id);
    }
}
