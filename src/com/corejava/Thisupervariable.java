package com.corejava;
/**
 * Practical No : 11
 *  Write a practical to use this/s uper variable
 * @author Bhavika
 */


public class Thisupervariable {
		class Account{
			int a;
			int b;

			public void setData(int a ,int b){
			  a = a;
			  b = b;
			 }
			public void showData(){
			   System.out.println("Value of A ="+a);
			   System.out.println("Value of B ="+b);
			 }
			public static void main(String args[]){
			   Account myObj = new Account();
			   obj.setData(2,3);
			   obj.showData();
			 }

		}
	}

