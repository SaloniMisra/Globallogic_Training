package com.globallogic.Consumer;

import java.util.Random;
import java.util.function.Supplier;

public class Supplier1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Supplier <Integer> s=()-> new Random().nextInt();
System.out.println(s.get());
	}

}
