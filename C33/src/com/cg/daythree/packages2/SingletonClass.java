package com.cg.daythree.packages2;

public class SingletonClass {
	//Singleton Object
	private static SingletonClass obj = new SingletonClass();
	
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	private SingletonClass() {
		super();
		// TODO Auto-generated constructor stub
	}

	public static SingletonClass getObj() {
		return obj;
	}

	public static void setObj(SingletonClass obj) {
		SingletonClass.obj = obj;
	}

	@Override
	public String toString() {
		return "SingletonClass [id=" + id + "]";
	}
	
}
