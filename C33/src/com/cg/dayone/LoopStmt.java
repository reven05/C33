package com.cg.dayone;

public class LoopStmt {

	public static void main(String[] args) {
		//FOR
		/*for(INTI;COND;INC/DEC) {
			STMT;
		}*/
		for (int i = 0; i<=10; i++) {
			if(i==5) {
				continue;
			}
			System.out.println(i);
		}
		for (int i=0; i<5; i++) {
			//System.out.println("DMI LIT");
		}
		
		//Nested FOR Loop
		for (int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				System.out.print("$");
			}
			System.out.println();
		}
		
		int a =0;
		//WHILE Loop
		while (a>6) {
			System.out.println("While True");
			a++;
		}
		
		//DO WHILE Loop
		do {
			System.out.println("Do While True");
			a++;
		}while(a>6);
	}

}



 