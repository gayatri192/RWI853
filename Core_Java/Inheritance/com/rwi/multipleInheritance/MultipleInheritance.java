package com.rwi.multipleInheritance;

public class MultipleInheritance{
    public static void main(String[] args) {
        Person person = new Person("Anil");
        person.setEmployeeId(111);
        person.setStudentId(211);

        person.displayDetails();
        person.work();
        person.study();
    }
}