package com.cg.dayone;

public class CondStmt {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		//IF
		if (5>6) {
			System.out.println("Satisfied");
		}
		
		//IF ELSE
		if (5>6) {
			System.out.println("Satisfied");
		}
		else {
			System.out.println("Not Satisfied");
		}
		
		//ELSE IF
		if ((5>6)&&(6>5)) {
			System.out.println("Satisfied");
		}
		else if ((5>6)||(6>5)) {
			System.out.println("Satisfied");
		}
		else {
			System.out.println("Nothing Satisfied");
		}
		
		//Nested IF
		if (5>6) {
			System.out.println("Satisfied");
			if (6>5) {
				System.out.println("Nested IF");
			}
		}
		int a = 1;
		//SWITCH
		switch(a) {
		case 1:
			System.out.println("Case 1");
			break;
		case 2:
			System.out.println("Case 2");
			break;
		case 3:
			System.out.println("Case 3");
			break;
		case 4:
			System.out.println("Case 4");
			break;
			
		default:
			System.out.println("Invalid Case");
		}
	}

}
