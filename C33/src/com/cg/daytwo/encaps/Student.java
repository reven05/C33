//Student Entity(Encapsulation)
package com.cg.daytwo.encaps;

public class Student {
	String name;
	int id;
	String dept;
	String college;
	long mobile;
	long aadhar;
	
	//getter & setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getCollege() {
		return college;
	}
	public void setCollege(String college) {
		this.college = college;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	public long getAadhar() {
		return aadhar;
	}
	public void setAadhar(long aadhar) {
		this.aadhar = aadhar;
	}

	//to string
	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", dept=" + dept + ", college=" + college + ", mobile=" + mobile
				+ ", aadhar=" + aadhar + "]";
	}
	
	
	
	
}
