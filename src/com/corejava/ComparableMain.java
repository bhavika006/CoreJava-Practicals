package com.corejava;
/**
 * Practical no : 23
 * Write a program to Demonstrate Comparable 
 * 
 * @author Bhavika
 */
public class ComparableMain implements Comparable < ComparableMain > {

	private String Brand;
	private int Ram1;
	private int Price;

	// Argument constructor
	public ComparableMain(String brand, int ram1, int price) {
		super();
		this.Brand = brand;
		this.Ram1 = ram1;
		this.Price = price;
	}

	public String getBrand() {
		return Brand;
	}

	public void setBrand(String brand) {
		this.Brand = brand;
	}

	public int getRam1() {
		return Ram1;
	}

	public void setRam1(int ram1) {
		this.Ram1 = ram1;
	}

	public int getPrice() {
		return Price;
	}

	public void setPrice(int price) {
		this.Price = price;
	}

	@Override
	public String toString() {
		return "Laptop [brand=" + Brand + ", ram1=" + Ram1 + ", price=" + Price + "]";
	}

	public int compareTo(ComparableMain lap2) {
		if (this.getRam1() > lap2.getRam1()) {
			return 1;
		} else {
			return -1;
		}
	}

}