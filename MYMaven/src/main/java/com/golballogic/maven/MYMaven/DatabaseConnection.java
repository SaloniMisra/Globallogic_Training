package com.golballogic.maven.MYMaven;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DatabaseConnection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String username="root";
			String password="root";
			String url="jdbc:mysql://localhost:3306/employee";
			Connection con=DriverManager.getConnection(url,username, password);
			Statement st=con.createStatement();
			String query ="select * from employees";
			//String insertQuery="insert into employees(emp_id,emp_name) values(4444,'Saloni')";
			//st.execute(insertQuery);
			//String deleteQuery="delete from employees where emp_id=44444";
			//st.executeUpdate(deleteQuery);
			ResultSet rs=st.executeQuery(query);
			while(rs.next())
			{
				System.out.println("id : "+" "+rs.getInt(1)+" "+"name : "+" "+rs.getString(2));
			}
			
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

}
