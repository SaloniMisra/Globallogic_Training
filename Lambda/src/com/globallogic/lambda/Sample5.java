//create lambda to print sum of 1 to 10
package com.globallogic.lambda;

interface sum1 {
	public int sum();
}

public class Sample5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		sum1 s = () -> {
			int su = 0;
			for (int i = 0; i <= 10; i++) {
				su = su + i;
			}
			return su;
		};
		System.out.println(s.sum());
	}

}
