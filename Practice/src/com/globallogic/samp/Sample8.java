package com.globallogic.samp;

import java.util.*;

public class Sample8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.println("enter string :");
        String str=sc.nextLine();
        String rev="";
        for(int i=str.length()-1;i>=0;i--)
        {
        	rev=rev+str.charAt(i);
        }
        if(str.equals(rev))
        {
        	System.out.println("Palindrome string");
        }
        else {
        	System.out.println("not palindrome");
        }
	}

}
