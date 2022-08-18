package com.corejava;
/**
 * Practical No : 11 
 * Write a practical to use this/super variable
 * @author Bhavika
 */

public class ThisSuperVariable {

		ThisSuperVariable(){	
			System.out.println("Value");		
		}
		ThisSuperVariable(int a ,int b){
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
		ThisSuperVariable myObj = new ThisSuperVariable();
		myObj.a();
		myObj.b();
	}

}
