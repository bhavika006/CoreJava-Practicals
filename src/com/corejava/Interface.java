package com.corejava;
/**
 * Practical no :17
 * Write a program to demonstrate the interface
 * @author LENOVO
 */
interface MAnimal{
	public void animalsound();
		public void sleep();
	}
class Pig1 implements MAnimal{
	public void animalsound() {
	System.out.println("The sound is wow wow");
	}
	public void sleep() {
		System.out.println("Zzz");
	}
}
public class Interface {
	public static void main(String[] args) {
		Pig1 myPig1 = new Pig1();
		myPig1.animalsound();
		myPig1.sleep();
		}
}