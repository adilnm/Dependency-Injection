package com.adil.dependancyinjection;

public class Student {

	private int id;
	private String studentName;

	public Student(int id, String studentName) {
		this.id = id;
		this.studentName = studentName;
	}

	public Student(int id) {
		this.id = id;
	}

	public void display() {
		System.out.println("This is the student: " + studentName + " and his id is " + id);
	}

}
