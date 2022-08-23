package com.corejava;
/**
 * Practical no:15
 * Multi-level Inheritance
 * @author Bhavika
 */
class A2 // Super class
{
	int a,b,c;
	void add()
	{
		a = 10;b = 20;
		c = a + b;
		System.out.println("sum of number" +c);
	}
	void sub() 
	{
		a = 100; b=200;
		c = a-b;
		System.out.println("sub of number"+c);
	}
}
class B2 extends A2 // Sub1
{
	int a,b,c;
	void multi()
	{
		a = 10;b = 20;
		c = a * b;
		System.out.println("Multipication of the number"+c);
	}
	void div() {
		a = 10; b = 2;
		c = a / b;
		System.out.println("Division of the number"+c);
	}
}
class C2 extends B2{
	int a,b,c;
	void rem()
	{
		a = 10; b = 20;
		c = a % b;
		System.out.println("Remainder of the number"+c);
	}
}
public class MultiInheritance {
	public static void main(String[] args) {
	C2 r = new C2();
	r.rem();
	r.add();
	r.div();
	r.sub();
	r.multi();
	}
}
