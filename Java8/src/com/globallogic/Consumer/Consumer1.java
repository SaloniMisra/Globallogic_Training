package com.globallogic.Consumer;

import java.util.*;
import java.util.function.Consumer;

public class Consumer1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Consumer<String> consumer =  str -> System.out.println(str);
		
		consumer.accept("Saloni Misra");
//example 2
		Consumer<String> consumer01=str1->System.out.println(str1+" world");
		Consumer<String> consumer2= str->System.out.println(str+" java");
		consumer01.andThen(consumer2).accept("hello");
		//example3
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(10);
		al.add(90);
		al.add(170);
		al.add(60);
		al.add(24);
		Consumer<Integer> consumer3=(a)->System.out.println(a);
		al.forEach(consumer3);
	}

}
