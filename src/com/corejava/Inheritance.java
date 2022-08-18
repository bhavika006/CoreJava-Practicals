package com.corejava;

class A{
		 void display() {
			System.out.println("Base class");
		}
	}
	class B extends A{
		public void show() {
			System.out.println("Display call");
		}
	}
public class Inheritance {
	public static void main(String[] args) {
		A obj = new B();
		obj.display();
	}
}
