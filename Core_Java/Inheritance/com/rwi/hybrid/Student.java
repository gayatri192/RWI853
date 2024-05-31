package com.rwi.hybrid;

public class Student extends Person {
    int studentId;

    Student(String name, int studentId) {
        super(name);
        this.studentId = studentId;
    }

    int getStudentId() {
        return studentId;
    }

}
