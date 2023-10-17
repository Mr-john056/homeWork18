package pro.sky.homeWork18.service;

import pro.sky.homeWork18.model.Employee;

public interface EmployeeService {
    Employee add(String firstName, String lastName);

    Employee remove(String firstName, String lastName);

    Employee find(String firstName, String lastName);
}
