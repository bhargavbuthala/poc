package com.org.employee.control;

import com.org.employee.model.Employee;
import com.org.employee.repository.EmployeeRepository;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeControl {
 @Autowired
    private EmployeeRepository employeeRepository;
    @PostMapping("/create")
    public void create(@RequestBody Employee employee)
    {

        employeeRepository.save(employee);
    }
    @GetMapping
    public List<Employee> getdetails(){
        List<Employee> all=employeeRepository.findAll();
        return all;
    }
        @PutMapping("/update")
    public void updateByEmployeeRecord(@RequestBody Employee employee){
        employeeRepository.save(employee);
    }
    @DeleteMapping
    public void deleteById(@PathVariable("empId") String empId)
    {
        this.employeeRepository.deleteById(Integer.valueOf(empId));

    }

}
