//create lambda to find min no.
package com.globallogic.lambda;

import java.util.*;

@Functionalinterface
interface co {
	public int max(int a, int b);

}

public class Sample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		co c = (a, b) -> {
			return Math.min(a, b);
		};

		System.out.println(c.max(12, 89));
	}
}
