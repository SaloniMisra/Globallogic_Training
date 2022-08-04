package com.globallogic.Iterator;
import java.util.*;
public class Iterator1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<String> list=new ArrayList<String>();
list.add("MATHS");
list.add("HINDI");
list.add("English");
list.add("Computer Science");
Iterator<String> ls=list.iterator();
while(ls.hasNext())
{
	System.out.println(ls.next());
}
//Collections.sort(ls);

	}

}
