package com.globallogic.Consumer;
import java.util.*;
import java.util.function.*;
public class Predicate1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Predicate<Integer> p= (a) ->{
			if(a%2==0)
			{
				return true;
			}
			else {
				return false;
			}
		};
		System.out.println(p.test(9));

	}

}
