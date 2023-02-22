package com.jsp.testApp;

import java.sql.*;

public class Dml2 {

	public static void main(String[] args) 
	{
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("step 1 done");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=root");
			System.out.println("step 2 done");
			
			//PreparedStatement pstmt3=con.prepareStatement("insert into student.studentrecords values (55,'Babita',30)");
			PreparedStatement pstmt=con.prepareStatement("update student.studentrecords set name='Bhide' where id=83");
			System.out.println("step 3 done");
			//PreparedStatement pstmt1=con.prepareStatement("delete from student.studentrecords where id=218");
			//Execute the sql queries
			
			//pstmt3.executeUpdate();
			pstmt.executeUpdate();
		//	pstmt1.executeUpdate();
			
		} 
		catch (Exception e) 
		{
			
			e.printStackTrace();
		}
		
		

	}

}
