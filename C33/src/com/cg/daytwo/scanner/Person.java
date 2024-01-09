//Person Entity
package com.cg.daytwo.scanner;

public class Person {
	String name;
	int phone;
	String city;
	//default constructor
	public Person() {
		super();
		System.out.println("Default Constructor");
	}

	//Parameterized Constructor
	public Person(String name, int phone, String city) {
		super();
		this.name = name;
		this.phone = phone;
		this.city = city;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", phone=" + phone + ", city=" + city + "]";
	}
}
