package com.globallogic.samp;

import java.util.*;
import java.util.Scanner;

public class Sample10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter string");
		String str = sc.nextLine();
		String rev="";
		String[] st=str.split("\\.");
		for(int i=0;i<st.length;i++)
		{
			String word=st[i];
			for(int j=word.length()-1;j>=0;j--)
			{
				rev=rev+word.charAt(j);
			}
			rev=rev+".";
		}
	
		System.out.println(rev);
	}

}
