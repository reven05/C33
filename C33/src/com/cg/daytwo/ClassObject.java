package com.cg.daytwo;

//Class
public class ClassObject {
	//Method
	void print() {
		System.out.println("Hi Hello!!!");
	}
	
	int display() {
		System.out.println("Display Method");
		return 0;
	}

	public static void main(String[] args) {
		//Creating An Object
		System.out.println("Main method");
		ClassObject co = new ClassObject();
		co.display();
		co.print();
		co.display();
		co.print();
		co.print();
		
	}

}
