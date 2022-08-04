package com.globallogic.com;

class Vehicle {
	public void run() {
		System.out.println("Vehicle running");
	}
}

class Bike extends Vehicle {
	public void run() { // super.run();
		System.out.println("Bike running");
	}
}

public class Overriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle bk = new Vehicle();
		bk = new Bike();
		bk.run();

	}

}
