package com.cg.daythtree.packages;

public class Base {
	//default variable
	int defVar = 34;
	//public variable
	public int pubVar = 55;
	//private variable
	private int priVar = 22;
	//protected variable
	protected int proVar = 66;
	
	//default method
	void defMtd() {
		System.out.println("Default Method");
		System.out.println(defVar);
	}
	
	//public method
	public void pubMtd() {
		System.out.println("Public method");
		System.out.println(pubVar);
	}
	
	//private method
	private void priMtd() {
		System.out.println("Private Method");
		System.out.println(priVar);
	}
	
	//protected method
	protected void proMtd() {
		System.out.println("Protected Method");
		System.out.println(proVar);
	}

}
