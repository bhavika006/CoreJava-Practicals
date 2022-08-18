package com.corejava;
/**
 * Practical no:15
 * Multi-level Inheritance
 * @author Bhavika
 */
public class MultiInheritance {
		class A // Super class
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
		class B extends A // Sub1
		{
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
		class C extends B{
			void rem()
			{
				a = 10; b = 20;
				c = a % b;
				System.out.println("Remainder of the number"+c);
			}
		}

		public static void main(String[] args) {
			C r = new C();
			r.add();r.sub();r.multi();r.div();r.rem();

	}
}
