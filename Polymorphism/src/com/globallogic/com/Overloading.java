package com.globallogic.com;

class Calculation {
	public void sum() {
		System.out.println("will find sum");
	}

	public int sum(int a, int b) {
		int c = a + b;
		// System.out.println(c);
		return c;
	}

	public int sum(int a, int b, int c) {
		int c1 = a + b + c;
		// System.out.println(c1);
		return c1;
	}
}

public class Overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculation cal = new Calculation();
		System.out.println(cal.sum(3, 4));
		System.out.println(cal.sum(2, 1, 1));
		cal.sum();
	}

}
