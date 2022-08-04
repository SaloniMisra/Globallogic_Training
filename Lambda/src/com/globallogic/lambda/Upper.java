package com.globallogic.lambda;
interface Up{
	void print(String str1);
}
public class Upper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="hello";
		Up u=(str1)->{
			System.out.println(str.toUpperCase());
		};
		u.print(str);

	}

}
