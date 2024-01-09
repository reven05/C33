package com.cg.daythtree.packages;

public class AccessMain {

	public static void main(String[] args) {
		Base b = new Base();
		System.out.println(b.defVar);
		System.out.println(b.proVar);
		System.out.println(b.pubVar);
		//System.out.println(b.priVar);
		
		b.defMtd();
		b.proMtd();
		b.pubMtd();
		//b.priMtd();
	}

}
