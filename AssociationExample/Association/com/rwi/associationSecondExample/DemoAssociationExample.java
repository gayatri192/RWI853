package com.rwi.associationSecondExample;

import java.util.ArrayList;
import java.util.List;

class Student{
	
	private String name;
	private int studentId;
	
	
	public Student(String name, int studentId){
		this.name = name;
		this.studentId = studentId;
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	
	public void displayDetails(){
		System.out.println("Student Name: " + name + ", Student ID: " + studentId);
	}
	
}


class Course{
	
	private String courseName;
	private List<Student> students;
	
	public Course(String courseName){
		this.courseName = courseName;
		this.students = new ArrayList<>();
	}

	public String getCourseName() {
		return courseName;
	}
	
	public void addStudents(Student student){
		students.add(student);
	}

	public List<Student> getStudents() {
		return students;
	}

	public void displayCourseDetails(){
		System.out.println("Course Name: " + courseName);
        System.out.println("Enrolled Students:");
        for(Student student : students){
        	student.displayDetails();
        }
	}
	
}

public class DemoAssociationExample {

	public static void main(String[] args) {
		
		Student student1 = new Student("Sujal", 01);
		Student student2 = new Student("Harshal", 02);
		
		Course course = new Course("Java Programming");
		// Associate students with the course
		course.addStudents(student1);
		course.addStudents(student2);
		
		// Display course details along with associated students
		course.displayCourseDetails();
		

	}

}
