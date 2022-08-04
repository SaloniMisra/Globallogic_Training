package com.globallogic.Search;

public class Linear {
	public static int check(int a,int[] arr)
	{
		for(int i=0;i<arr.length;i++)
			{
			if(arr[i]==a)
			{
				return i;
			}
			}
		return -1;
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,4,7,4,9,6};
		int key=6;
		System.out.println(check(key,arr));
		

	}

}
