package com.globallogic.Map;
import java.util.*;
import java.lang.*;
public class Map {

	public interface Entry {

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable<String,Integer> map=new Hashtable<String,Integer>();
		map.put("Saloni",1);
		map.put("Riya",2);
		map.put("tarun",3);
		for(java.util.Map.Entry<String, Integer> m:map.entrySet()) {
		System.out.println(m.getKey()+" "+m.getValue());
		}

	}

}
