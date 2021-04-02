package com.org.employee.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Setter
@Getter
public class Employee {
    @Id
    private int empId;
    private String empName;
    private String empAddress;
    private Double empSalary;
    private Double netSalary;

    }

