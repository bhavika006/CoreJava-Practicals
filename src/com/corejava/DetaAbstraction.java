package com.corejava;
/**
 * Practical no :13
 * Write a program to demonstrate data abstraction.
 * @author Bhavika
 */
abstract class car{
	abstract void accelerate();
}
class Maruti extends car{
	void accelerate() {
		System.out.println("Maruti::accelerate");
	}
}
public class DetaAbstraction {
	public static void main(String args[]) {
			car Obj = new Maruti();
			Obj.accelerate();
	}

}
