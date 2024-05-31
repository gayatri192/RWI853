package com.rwi.multipleInheritance;

public class Person implements Employee, Student {
	
    private String name;
    private int employeeId;
    private int studentId;

    Person(String name) {
        this.name = name;
    }

    // Implement Employee interface methods
    @Override
    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    @Override
    public int getEmployeeId() {
        return employeeId;
    }

    @Override
    public void work() {
        System.out.println(name + " is working.");
    }

    // Implement Student interface methods
    @Override
    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    @Override
    public int getStudentId() {
        return studentId;
    }

    @Override
    public void study() {
        System.out.println(name + " is studying.");
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Employee ID: " + getEmployeeId());
        System.out.println("Student ID: " + getStudentId());
    }
}
