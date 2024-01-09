package com.cg.daytwo.encaps;

public class StudentMain {

	public static void main(String[] args) {
		Student s = new Student();
		s.setName("Rev");
		s.setId(234);
		s.setCollege("LIT");
		s.setDept("IT");
		s.setMobile(1234567890);
		s.setAadhar(234567890);
		
		System.out.println(s.toString());
	}
}
