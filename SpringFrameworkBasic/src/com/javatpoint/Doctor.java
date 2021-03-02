package com.javatpoint;

public class Doctor {
	private int id;
	private String name;
	private Address address; //Aggregation - HAS-A relationship b/w classes (Address and Doctor)

	public Doctor() {
		System.out.println("Doctor default constructor");
	}
	public Doctor(int id, String name, Address address) {
//		super();
		this.id=id;
		this.name=name;
		this.address=address;
		}
	void show() {
		System.out.println("ID - " +id+ " Name - " +name);
		
		System.out.println(address.toString());
	}

}
