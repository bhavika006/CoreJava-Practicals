package com.corejava;

public class Laptop implements Comparable<Laptop> {

	private String brand;
	private int ram1;
	private int price;

	public Laptop(String brand, int ram1, int price) {
		super();
		this.brand = brand;
		this.ram1 = ram1;
		this.price = price;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getRam1() {
		return ram1;
	}
	public void setRam1(int ram1) {
		this.ram1 = ram1;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Laptop [brand=" + brand + ", ram1=" + ram1 + ", price=" + price + "]";
	}
	@Override
	public int compareTo(Laptop lap2) {
		// this > lap2 = +
		// this < lap2 = -
		// this == lap2 = 0
		if(this.getRam1() > lap2.getRam1())
			return 1;
		else
			return -1;
		}
}