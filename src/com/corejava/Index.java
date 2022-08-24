package com.corejava;

import java.util.Arrays;

/**
 * Practical no :19 
 * Write a program to find the index of an array element.
 * @author Bhavika
 *
 */
public class Index {
	public static int findindex(int arr[], int t) {
		int index = Arrays.binarySearch(arr, t);
		return (index < 0) ? -1 : index;
	}

	public static void main(String[] args) {
		int[] my_array = { 1, 2, 3, 4, 5, 6, 7 };
		System.out.println("Index posistin of 5 is:" + findindex(my_array, 5));
		System.out.println("Index position of 7 is:" + findindex(my_array, 7));
	}
}
