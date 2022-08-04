package com.globallogic.Generic;
import java.util.*;
//import com.sun.org.apache.xpath.internal.operations.String;

class Student<A,B,C,D,E> {
	A id;
	B name;
	C school;
	D section;
	E marks;
	Student(A id,B name,C school,D section,E marks)
	{
		this.id=id;
		this.name=name;
		this.school=school;
		this.section=section;
		this.marks=marks;
				
	}

	
	public void print()
	{
		System.out.println(" THE ID IS: "+id);
		System.out.println("NAME OF STUDENT IS: "+name);
		System.out.println("School of student is: "+ school);
		System.out.println("Section of student is :"+ section);
		System.out.println("Marks Of student is "+ marks);
	}
}
public class Generic {

	public static void main(String str[]) {
		// TODO Auto-generated method stub
Student<String,String,String,String,String> saloni= new Student<String,String,String,String,String>("10","SALONI MISRA","St. Agnes' Loreto Day School","D","80");
saloni.print();
	}

}
