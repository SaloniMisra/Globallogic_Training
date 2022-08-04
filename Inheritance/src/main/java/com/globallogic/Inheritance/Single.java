package com.globallogic.Inheritance;

class Animal {
	public void eat() {
		System.out.println("Animal is eating");
	}
}

class Dog extends Animal {
	public void bark() {
		System.out.println("Dog is barking");
	}
}

public class Single {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d = new Dog();
		d.eat();
		d.bark();
	}

}
