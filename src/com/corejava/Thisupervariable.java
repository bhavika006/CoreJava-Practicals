package com.corejava;

/**
 * Practical No : 11 Write a practical to use this/s uper variable
 * 
 * @author Bhavika
 */

public class Thisupervariable {

	Thisupervariable(){
	System.out.println("bs");		
	}
	Thisupervariable(int a ,int b){
	this();
	this.a =a;
	this.b = b;
		}

	int a;
	int b;

	public void a() {
		System.out.println("Value of A =" + a);
		}
public void b() {
	System.out.println("Value of B =" + b);
}
	public static void main(String args[]) {
		Thisupervariable myObj = new Thisupervariable();
		myObj.a();
		myObj.b();

	}

	
}
