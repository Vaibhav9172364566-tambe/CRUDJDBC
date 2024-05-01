package com.demo1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Read {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
	//	Connection con=DriverManager("jdbc:mysql://localhost:3306/java","root","pass123");
	       Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/java","root","pass123");
//	       Statement ps=con.createStatement();
//		ResultSet rs=ps.executeQuery("select name  from register");
//		while(rs.next()) {
//			System.out.println("rs.getString(1)");
//		}
//		
		 PreparedStatement ps=con.prepareStatement("select * from register");
		  
		 ResultSet rs= ps.executeQuery();
		 while(rs.next()) {
			 String name=rs.getString("name");
			 System.out.println(name);
		 }
		 


	}

}
