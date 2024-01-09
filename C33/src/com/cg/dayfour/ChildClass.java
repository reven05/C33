package com.cg.dayfour;

public class ChildClass extends ParentClass {
	int id;
	String city;
	
	void print() {
		System.out.println("City is "+city);
	}
	
	int id() {
		return id;
	}

}
