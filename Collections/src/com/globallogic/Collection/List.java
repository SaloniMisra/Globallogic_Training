package com.globallogic.Collection;
import java.util.*;
public class List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list=new ArrayList<Integer>();
		//ADD ELEMENTS
    list.add(1);
    list.add(3);
    list.add(4);
    list.add(112);
    list.add(14);
    for(int i=0;i<list.size();i++) {
    System.out.println(list.get(i));
    }
    //REMOVE ELEMENTS
    list.remove(2);
    System.out.println(list);
    list.set(0, 222);
    list.sort(null);
    System.out.println(list);
	}

	

}
