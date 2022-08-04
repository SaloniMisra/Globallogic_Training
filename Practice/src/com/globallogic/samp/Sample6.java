package com.globallogic.samp;

public class Sample6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k=0;
		int p=0;
		String str="Hello, World";
		int j=str.indexOf('o');
		int m=str.indexOf(',');
		System.out.println("the first occurance of 'o' is "+j+" the first occurance of ',' is "+m);
				
				for(int i=0;i<str.length();i++)
				{
					if(str.charAt(i)=='o')
					{
						k=i;
					}
					else if (str.charAt(i)==',')
					{
						p=i;
					}
				}
				System.out.println("the last index of 'o' is: "+k+"and last index of ',' is "+p);

	}

}
