package com.javatpoint;

public class Student {
private String name;
private String address;

public String getAddress() {
	return address;
}

public void setAddress(String address) {
	this.address = address;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public void displayInfo(){
	System.out.println("Hello: "+name+ " Address -" +address);
}
}
