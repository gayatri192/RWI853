package com.rwi.hybrid;

public class Employee extends Person {
    int employeeId;

    Employee(String name, int employeeId) {
        super(name);
        this.employeeId = employeeId;
    }

    int getEmployeeId() {
        return employeeId;
    }


}
