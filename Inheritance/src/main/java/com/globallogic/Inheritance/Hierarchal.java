package com.globallogic.Inheritance;
class Vehicle{
	public void print_vehicle()
	
	{
		System.out.println("This is vehicle");
	}
}
class Bike extends Vehicle{
	public void print_Bike()
	{
		System.out.println("This is bike");
	}
}
class Car extends Vehicle{
	public void print_car()
	{
		System.out.println("This is car");
	}
}
public class Hierarchal {
	public static void main(String args[]) {
		Car c=new Car();
		c.print_vehicle();
		c.print_car();
	
	}
}
