package com.cg.daythree.packages2;

public class SingletonMain {

	public static void main(String[] args) {
		SingletonClass sc = SingletonClass.getObj();
		SingletonClass sc2 = SingletonClass.getObj();
		
		sc.setId(10);
		sc.toString();
	}

}
