package com.corejava;

/**
 * Practical no:15 Multi-level Inheritance.
 * 
 * @author Bhavika
 */

class SchoolStudent {

	String studentName;
	int studentRollno;

	public void setData() {

		studentName = "Bhavika";
		studentRollno = 6;
	}

}

class SubjectName extends SchoolStudent {

	String SubjectName = "computer";

	public void display() {
		System.out.println("Student Name :" + studentName);
		System.out.println("Student Rollno :" + studentRollno);
	}

}

class RoomNo extends SubjectName {

	String RoomNo = "2'nd";

	public void display() {

		System.out.println("Student Name :" + studentName);
		System.out.println("Student Rollno :" + studentRollno);
		System.out.println("Branch Name :" + SubjectName);
		System.out.println("Room No :" + RoomNo);
	}

}

public class MultiInheritance {

	public static void main(String[] args) {
		SubjectName subjectName = new SubjectName();
		subjectName.setData();
		subjectName.display();

		// Multi-level Inheritance
		RoomNo roomNo = new RoomNo(); // Child class object
		subjectName.setData(); // Call parent class method
		subjectName.display(); // Call child class method
	}

}
