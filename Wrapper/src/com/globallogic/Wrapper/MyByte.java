package com.globallogic.Wrapper;

public class MyByte {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//BYTE
		byte b=5;
		Byte b1=new Byte(b);
		System.out.println(Byte.MAX_VALUE);
		System.out.println(Byte.MIN_VALUE);
		System.out.println("double value is :"+b1.doubleValue());
		
		System.out.println("float value is :"+b1.floatValue());
		
		//INTEGER
		Integer i=new Integer(14);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.toBinaryString(i));
		System.out.println(Integer.toString(b));
		//find the max of two number
		System.out.println(Integer.max(100, 111));
		
		//minimum of two number
		System.out.println(Integer.min(111, 100));

		System.out.println(i.compareTo(10));

	}

}
