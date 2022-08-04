package com.globallogic.Inheritance;

class A {
	public void add() {
		System.out.println("Do addition");
	}
}

class B extends A {
	public void sub() {
		System.out.println("Do substraction");
	}
}

class C extends B {
	public void multipli() {
		System.out.println("Do multiplication");
	}
}

public class Multi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C c1 = new C();
		c1.add();
		c1.sub();
		c1.multipli();

	}

}
