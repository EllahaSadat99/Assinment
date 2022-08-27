package com.first;

public class CreateObject {
	
	String name ;
	String color  ;
	String model ;
	double price;
	int year;
	

	public CreateObject(String name, String color, String model, double price, int year) {
	
		this.name = name;
		this.color = color;
		this.model = model;
		this.price = price;
		this.year = year;
	}

	String gassUsage () {                         /// local veriable
		return "jeep use 10 gallon per 100";
	}
	
	String speed () {
		return "run 250 MPH";
		
	}

	public static void main(String[] args) {
		// name of the class + anme for your object + = + new + constructor();
		
		CreateObject myobj = new CreateObject ();
		
		System.out.println(myobj.name);
		System.out.println(myobj.color);
		System.out.println(myobj.model);
		System.out.println(myobj.price);
		
		System.out.println(myobj.gassUsage());
		System.out.println(myobj.speed());
		
		

	}

}
