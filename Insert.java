package com.demo1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Insert {
	

	public static void main(String[] args) throws ClassNotFoundException, SQLException  {
		 
//		Class.forName("com.mysql.cj.jdbc.Driver");
//		DriverManager.getConnection("jdbc:mysql//localhost:3306/java","root","pass123");
//        System.out.println("success");
		String name1="vaibhav Tambe";
		String email1="vaibhav1@gmail.com";
		String pass1="123";
		String gender1="malee";
		String city1="vaijapur";
		
//        Class.forName("com.mysql.cj.jdbc.Driver");
//        
//       Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/java","root","pass123");
////       PreparedStatement ps=con.prepareStatement("insert into register values('"+name1 +"', '"+email1 +"', '"+pass1 +"','" +gender1 +"','" +city1+"')");
//       PreparedStatement ps=con.prepareStatement("insert into register values(?,?,?,?,?)");
//       ps.setString(1, name1);
//       ps.setString(2, email1);
//       ps.setString(3, pass1);
//       ps.setString(4, gender1);
//       ps.setString(5, city1);

	       Class.forName("com.mysql.cj.jdbc.Driver");
       Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/java","root","pass123");
       PreparedStatement ps=con.prepareStatement("insert into register values('abc','dsf','df','df','dsf')");
       ps.execute();
//       int i=ps.executeUpdate();
//       if(i>0) {
//    	   System.out.println("success");
//       }
//       else {
//    	   System.out.println("fail");
//       }
       
		System.out.println("success");
		
	}

}
//jdbc:mysql://localhost:3306/java