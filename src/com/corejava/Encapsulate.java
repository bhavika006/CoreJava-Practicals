package com.corejava;

public class Encapsulate {

			private String Name;
			private int Rollno;
			private int Age;

			public int getAge() {
				return Age;
			}
			public String getName() {
				return Name;
			}
			public int getRollno() {
				return Rollno;
			}
			public void setRollno(int newRollno) {
				Rollno = newRollno;
			}
			public void setName(String newName) {
				Name = newName;
			}
			public void setAge(int newAge) {
				Age = newAge;
			}
}
