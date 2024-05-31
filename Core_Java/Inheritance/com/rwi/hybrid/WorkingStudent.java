package com.rwi.hybrid;

public class WorkingStudent extends Person {
    int employeeId;
    int studentId;

    WorkingStudent(String name, int employeeId, int studentId) {
        super(name);
        this.employeeId = employeeId;
        this.studentId = studentId;
    }

    int getEmployeeId() {
        return employeeId;
    }

    int getStudentId() {
        return studentId;
    }

    void displayDetails() {
        System.out.println("Name: " + getName());
        System.out.println("Employee ID: " + getEmployeeId());
        System.out.println("Student ID: " + getStudentId());
    }

}
