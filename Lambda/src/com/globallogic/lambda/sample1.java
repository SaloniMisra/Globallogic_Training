//even odd lambda code
package com.globallogic.lambda;

import java.util.*;

interface EvenOdd {
	void check(int a);
}

public class sample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter a number :");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		EvenOdd evenodd = (a) -> {
			if (a % 2 == 0) {
				System.out.println("Number" + a + " is even");
			} else {
				System.out.println("Number is odd");
			}
		};
		evenodd.check(n);
	}

}
