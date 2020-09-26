package com.jspiders.springjdbc;

public class Student 
{
	private int regno;
	private String name;
	public int getRegno() {
		return regno;
	}
	public void setRegno(int regno) {
		this.regno = regno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Student()
	{
		super();
	}
	public Student(int regno, String name) {
		super();
		this.regno = regno;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [regno=" + regno + ", name=" + name + "]";
	}
	
	
}
