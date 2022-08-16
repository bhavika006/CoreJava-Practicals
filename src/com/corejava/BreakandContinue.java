package com.corejava;

/**
 * This is a Practical-6
 * Use the loop for 10 numbers and stop the execution after 7 numbers and skip any number.
 * @author  Bhavika
 * @version 1.8
 * @Since   March 2014
*/
public class BreakandContinue {

		public BreakandContinue() {
				
		}
		public static void main(String[] args) {
			//for loop  
			for(int i=1;i<=10;i++){  
				if(i==7){  
					//using continue statement  
					continue;//it will skip the rest statement  
				}
				System.out.println(i);  
			}
				System.out.println();

			for(int i=1;i<=10;i++){  
				if(i==7){  
					//using continue statement  
					break;//it will skip the rest statement  
				}  
				System.out.println(i);  
			}
		}  
}
