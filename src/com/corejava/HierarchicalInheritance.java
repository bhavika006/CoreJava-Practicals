package com.corejava;
/**
 * Practical no : 15
 * Hierarchical Inheritance
 * @author Bhavika
 */
	class A1
	{
	   public void methodA1()
	   {
	      System.out.println("method of Class A");
	   }
	}
	class B1 extends A1
	{
	   public void methodB1()
	   {
	      System.out.println("method of Class B");
	   }
	}
	class C extends A1
	{
	  public void methodC()
	  {
	     System.out.println("method of Class C");
	  }
	}
	class D extends A1
	{
	  public void methodD()
	  {
	     System.out.println("method of Class D");
	  }
	}
public class HierarchicalInheritance {

	  public static void main(String args[])
	  {
	     B1 obj1 = new B1();
	     C obj2 = new C();
	     D obj3 = new D();
	     //All classes can access the method of class A
	     obj1.methodA1();
	     obj2.methodA1();
	     obj3.methodA1();
	  }
}
