package pro.sky.homeWork18.service;

import pro.sky.homeWork18.model.Employee;

import java.util.List;
import java.util.Map;

public interface DepartmentService {
    public List<Employee> getAllByDepartment(int dep);

    public Map<Integer, List<Employee>> getAll(int dep);

    Map<Integer, List<Employee>> getAll();
}
