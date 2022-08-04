package com.globallogic.Stream;
import java.util.*;
import java.util.stream.*;
public class Stream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> ls=new ArrayList<Integer>();
		ls.add(20);
		ls.add(90);
		ls.add(10);
		ls.add(80);
		ls.add(60);
		ls.add(60);
		ls.add(50);
		
		//create a stream
		java.util.stream.Stream<Integer> st= ls.stream();
	List<String> ab=	ls.stream().filter(e->e>10).map(e->e+" hello").sorted().distinct().collect(Collectors.toList());
		System.out.println(ab);

	}

}
