package com.technojava1;

public class Shiva {
	public static void main(String[] args) {
		Sample s1 = new Sample("shiva ", 484);
		s1.display();
	}
}

class Sample {
	String name;
	int empid;
	String company = "Techno";

	public Sample(String name, int empid) {
		this.name = name;
		this.empid = empid;
	}

	public void display() {
		System.out.println("student " + name + " empid     " + empid + "    company    " + company);
	}
}