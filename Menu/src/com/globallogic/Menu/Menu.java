package com.globallogic.Menu;

import java.util.*;
 class Student1 implements Comparable{
	int salary;
	String name;
	public Student1( String name) {
		super();
		
		this.name = name;
	}
	
	public Student1(int salary, String name) {
		super();
		this.salary = salary;
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student1 [salary=" + salary + ", name=" + name + "]";
	}

	
	public int compareTo(Student1 o) {
		// TODO Auto-generated method stub
		
		 int compareage=((Student1)o).getSalary();
		 return this.salary-compareage;
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}
		}
	

public class Menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to menu based program : ");
		ArrayList<Student1> student = new ArrayList<Student1>();
		
		int sum=0;
		
			while(true) {

			System.out.println("Enter your choice::");
			int choice = sc.nextInt();// accept user input
			
			sc.nextLine();
			switch (choice) {
			case 1: {
				System.out.println("we will add employee please provide name of employee");
				String name = sc.nextLine();
				System.out.println("enter salary:");
				int n=sc.nextInt();
				sc.nextLine();
				student.add(new Student1(n,name));
				System.out.println(student);
				break;
			}
			case 2: {
				int count = 0;
            System.out.println("for Deleting employee please provide the name of employee");
            String n=sc.nextLine();
            for(Student1 e:student) {
            	
            	if(e.getName().equals(n))
            	{
            student.remove(e);
            	}
            	count++;
            }
            System.out.println(student);
            break;
			}
			case 3:
			{
				System.out.println("search element in java give name of employee to be searched");
				String name1=sc.nextLine();
				//int k=student.indexOf(new Student1(name1));
				
				for(Student1 e:student) {
					if(e.getName().equals(name1))
					{
						 System.out.println(student.indexOf(e));
					}}
				System.out.println("the index of "+name1 +" is : "+k);
				break;
			}
			case 4:
			{
				System.out.println("to update please provide value on which it is to be updated :");
			int p=sc.nextInt();
			sc.nextLine();
			System.out.println("provide name to be updated at index " +p);
			String ne=sc.nextLine();
			for(Student1 ea: student){
			if(ea.getName().equals(ne)){
			ea.setName(ne);
			}
			}
			System.out.println(student);
			break;
			}
			case 5:
			{
			Collections.sort(student,SortBy());
			for(Student1 e:student) {
			System.out.println( student);
			}
			break;
			}
			case 6:
			{
				double sum11=0;
				for(Student1 e:student)
				{
					sum1=sum1+e.getSalary();
				}
				System.out.println(sum1);
				break;
			}
			case 7:
			{
				int maxSal=Integer.MIN_VALUE;
				for(Student1 e:student) {
				if(maxSal < e.getSalary()) {
					maxSal=e.getSalary();
				}
				}
				System.out.println(maxSal+" is highest");
				break;
			}
			case 8:
			{
				int minSal=Integer.MAX_VALUE;
				for(Student1 e: student) {
					if(minSal> e.getSalary())
					{
				minSal=e.getSalary();
					}
				}
				System.out.println(minSal);
				break;
			}
			
			default:
			{
				System.out.println("wrong input");
			}
			}
			
		}

	}
}