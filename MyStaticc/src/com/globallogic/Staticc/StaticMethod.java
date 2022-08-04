package com.globallogic.Staticc;

class A {
	public static void paint() {
		System.out.println("Paint it red");
	}
}

public class StaticMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A.paint();

	}

	static {
		System.out.println("This is first line");
	}

}
