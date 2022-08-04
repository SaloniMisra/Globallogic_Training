package com.globallogic.lambda;

import java.util.*;

interface Check {
	void print(int a);
}

public class Sqr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=49;
		Check c=(a)->{
			System.out.println(Math.sqrt(num));
		};
		c.print(num);
	}

}
