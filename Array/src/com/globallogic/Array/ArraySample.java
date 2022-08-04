//createa array of object of student type and create and store 10 object and print 10 object value
package com.globallogic.Array;
import java.util.*;
class Student{
	int id;
	Student(int a)
	{
		id=a;
		
	}
}

public class ArraySample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student[] arr=new Student[10];
		
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<10;i++)
		{ System.out.println("Enter Student id:");
			int k=sc.nextInt();
			arr[i]=new Student(k);
		}
		for(int i=0;i<10;i++)
		{     
			System.out.println(arr[i].id);
		}

	}

}
