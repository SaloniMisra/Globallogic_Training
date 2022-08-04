package com.globallogic.Staticc;
class Employee {
	int id;
	static String company;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public static String getCompany() {
		return company;
	}

	public static void setCompany(String company) {
		Employee.company = company;
	}

	public Employee(int id, String company) {
   this.id=id;
   Employee.company=company;
	}
	void display()
	{
		System.out.println("id is:"+id+"company name is"+Employee.company);
	}

}
public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new Employee(121,"ABC");
		e1.display();
		Employee e2 = new Employee(123,"cbs");
		e2.display();
		e1.display();

	}

}
