package pro.sky.homeWork18.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.homeWork18.model.Employee;
import pro.sky.homeWork18.service.DepartmentService;
import pro.sky.homeWork18.service.EmployeeService;

import java.util.List;


@RestController
@RequestMapping("/dep")
public class DepartmentController {
    private final DepartmentService service;

    public DepartmentController(DepartmentService service) {
        this.service = service;
    }

    @GetMapping("/all")
    public ResponseEntity<?> getAllByDep(@RequestParam(required = false) Integer dep) {
        return dep == null ?
                ResponseEntity.ok(service.getAll())
                :
                ResponseEntity.ok(service.getAllByDepartment(dep));
    }

    @GetMapping("/max-salary")
    public Employee maxSalary(@RequestParam int department) {
        return EmployeeService.maxSalary(department);
    }

    @GetMapping("/min-salary")
    public Employee minSalary(@RequestParam int department) {
        return EmployeeService.minSalary(department);
    }
}
