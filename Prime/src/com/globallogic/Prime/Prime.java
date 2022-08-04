package com.globallogic.Prime;

import java.util.*;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		//10sc.close();
		
		System.out.println("enter no:");
		int n=sc.nextInt();
		for(int i=1;i<n;i++)
		{ int c=0;
		int k=0;
			while(k<=n) {
				
 if(k%n==0)
 {
	 c++;
 }
	k++;	}
		if(c==2) {
		System.out.println(i);
		}
	}
	}
}

