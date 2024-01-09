package com.cg.daytwo.scanner;

import java.util.Scanner;

import com.cg.daytwo.encaps.Student;

public class ScannerMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name: ");
		String name = null;
		name = sc.next();
		System.out.println("Name is : "+name);
		System.out.println("Enter Age: ");
		int age;
		age = sc.nextInt();
		System.out.println("Age is : "+age);
		sc.close();
	}

}
