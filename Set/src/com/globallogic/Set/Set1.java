//Create A set with all the implanatation with user defined class employee and perform the insert delete and searching and sorting
package com.globallogic.Set;

import java.util.*;

class Student implements Comparable<Student> {
	String name;
	String marks;

	@Override
	public String toString() {
		return "Student [name=" + name + ", marks=" + marks + "]";
	}

	public Student(String name, String marks) {
		super();
		this.name = name;
		this.marks = marks;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMarks() {
		return marks;
	}

	public void setMarks(String marks) {
		this.marks = marks;
	}

	@Override
	public int compareTo(Student m) {
		// TODO Auto-generated method stub
		
		return this.name.compareTo(m.name);
	}
}

public class Set1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<Student> set = new HashSet<Student>();
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("enter choice : ");
			int choice = sc.nextInt();
			sc.nextLine();

			switch (choice) {
			case 1: {

				System.out.println("enter name ");

				String name = sc.nextLine();
				System.out.println("enter marks ");
				String marks = sc.nextLine();

				set.add(new Student(name, marks));
				System.out.println(set);
				break;
			}
			case 2:
			{ System.out.println("enter name of student to be removed : ");
			  String na = sc.nextLine();
				Iterator<Student> iterator = set.iterator();
				while(iterator.hasNext()){
				  
					Student value = iterator.next();
					if((value.getName().equals(na))) {
				  iterator.remove(); // this function call remove the element from collection at run time
					}
					}
				System.out.println(set);
				break;
			}
		
			case 3: {
				System.out.println("enter name to be searched in set :");
				String n = sc.nextLine();
				for (Student e : set) {
					if (e.getName().equals(n)) {
						System.out.println(set.contains(e));
					}

				}

				break;

			}
			case 4:
			{
				List<Student> list=new ArrayList<Student>(set);
				Collections.sort(list);
				
				System.out.println(list);
			}
			}
		}
	}
}
