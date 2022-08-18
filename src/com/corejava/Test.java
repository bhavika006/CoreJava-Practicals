package com.corejava;

public class Test {

		public static void main(String[] args) {
			Encapsulate Obj = new Encapsulate();
			
			Obj.setRollno(1);
			Obj.setName("Bhavika");
			Obj.setAge(27);
			
				System.out.println("Name" + Obj.getName());
				System.out.println("Rollno"+ Obj.getRollno());
				System.out.println("Age"+ Obj.getAge());
		}
		
	}
