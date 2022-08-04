package com.globallogic.Array;

import java.util.*;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[4];
		// Reading value
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter values");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		//Print values
		//for(int i=0;i<arr.length;i++)
		//int k=0;
		for( int k:arr)
		{
			System.out.println("value at index"+" "+k+ " is "
					+ " "+arr[k]);
		}
	}

}
