package com.javatpoint;

public class Employee {
	private int id;
	private String name;
	private String address;

	public Employee() {
		System.out.println("Employee default constructor");
	}
	
	public Employee(int id) {
		this.id=id;
		
	}
	
	public Employee(String name) {
		this.name=name;
	}
	public Employee(int id, String name, String address) {
	this.id=id;
	this.name=name;
	this.address=address;
	}
	
	void show() {
		System.out.println("ID - " +id+ " Name - " +name+ " Address - "+address);
	}

}
