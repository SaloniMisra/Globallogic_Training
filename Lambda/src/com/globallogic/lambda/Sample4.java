//create lambda to print hello world
package com.globallogic.lambda;

interface hello {
	public String print1();
}

public class Sample4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		hello h = () -> {
			return ("Hello World");
		};
		System.out.println(h.print1());
	}

}
