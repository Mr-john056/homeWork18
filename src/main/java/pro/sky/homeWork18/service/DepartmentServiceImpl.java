package pro.sky.homeWork18.service;

import org.springframework.stereotype.Service;
import pro.sky.homeWork18.model.Employee;
import pro.sky.homeWork18.runner.FillEmployees;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public abstract class DepartmentServiceImpl implements DepartmentService {
    private final EmployeeServiceImpl employeeServiceImpl;


    public DepartmentServiceImpl(EmployeeServiceImpl employeeServiceImpl) {
        this.employeeServiceImpl = employeeServiceImpl;
    }

    public List<Employee> getAllByDepartment(int dep) {
        return employeeServiceImpl.findAll()
                .stream()
                .filter(employee -> employee.getDepartment() == dep)
                .collect(Collectors.toList());
    }

    public List<Employee> getMaxSalary(int dep) {
        return employeeServiceImpl.maxSalary()
                .stream()
                .filter(employee -> employee.getDepartment() == dep)
                .max(Comparator.comparing(Employee::getSalary));
    }

    public List<Employee> getMinSalary(int dep) {
        return employeeServiceImpl.minSalary()
                .stream()
                .filter(employee -> employee.getDepartment() == dep)
                .min(Comparator.comparing(Employee::getSalary));
    }

    @Override
    public Map<Integer, List<Employee>> getAll() {
        return employeeServiceImpl.findAll()
                .stream().collect(Collectors.groupingBy(Employee::getDepartment));

    }

}
