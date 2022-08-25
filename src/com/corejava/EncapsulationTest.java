package com.corejava;

/**
 * Practical no :14
 * Output the program.
 * 
 * @author Bhavika
 */
public class EncapsulationTest {

	public static void main(String[] args) {
		Encapsulate Obj = new Encapsulate();
		Obj.setRollno(1); // Set the value in output
		Obj.setName("Bhavika");
		Obj.setAge(27);

		System.out.println("Name" + Obj.getName());
		System.out.println("Rollno" + Obj.getRollno());
		System.out.println("Age" + Obj.getAge());
	}

}
