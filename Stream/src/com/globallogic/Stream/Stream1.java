//print even numbers using stream api
package com.globallogic.Stream;
import java.util.*;
import java.util.stream.Collectors;
public class Stream1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<Integer> ab=new ArrayList<Integer>();
ab.add(70);
ab.add(70);
ab.add(50);
ab.add(90);
ab.add(40);
ab.add(35);
ab.add(66);
java.util.stream.Stream<Integer> st=ab.stream();
List<Integer>l1=st.filter(i->i%2==0).sorted().distinct().collect(Collectors.toList());
System.out.println(l1);
java.util.stream.Stream<Integer> st1=ab.stream();
List<Integer> ab2=st1.filter(i->i>50).sorted().distinct().collect(Collectors.toList());
System.out.println(ab2);
	}

}
