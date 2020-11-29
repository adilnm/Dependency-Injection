package com.adil.dependancyinjection;

public class Student {

	private int id;
	private String studentName;

	public void setId(int id) {
		this.id = id;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public void display() {
		System.out.println("This is the student: " + studentName + " and his id is " + id);
	}

}
