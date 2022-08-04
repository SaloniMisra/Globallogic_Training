package com.globallogic.samp;

import java.util.ArrayList;
import java.util.Scanner;

public class Samplee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = new String();
		Scanner sc = new Scanner(System.in);
		str = sc.nextLine();
		String[] a = str.split(" ");
		String[] b = new String[a.length];
		for (int i = 0; i < str.length(); i++) {
			String rev = new String();
			ArrayList<String> word=new ArrayList<String>();
			 word.add(arr[i]);
			for (int j = word.length() - 1; j >= 0; j--) {
				rev = rev + word.charAt(j);

			}
			if(word.equals(rev))
			{
				word.replaceAll(rev, "*");
			}
			b[i]=word;
		}
System.out.println(b);
	}

}
