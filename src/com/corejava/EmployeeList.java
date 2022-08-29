package com.corejava;

public class EmployeeList implements Comparable<EmployeeList> {

	private String name;
	private int id;

	public EmployeeList(String name, int id) {
		this.name = name;
		this.id = id;
	}

	public int getId() {
		return this.id;
	}

	@Override
	public int compareTo(EmployeeList o) {
		if (this.getId() == o.getId())
			return 0;
		else if (this.getId() > o.getId())
			return 1;
		else
			return -1;
	}

}
