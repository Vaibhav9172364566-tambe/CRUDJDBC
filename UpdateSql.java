package com.demo1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateSql {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/java","root","pass123");
		System.out.println("Success");
		PreparedStatement ps=con.prepareStatement("update register set city=?,gender=? where name ='abc'");
		
		ps.setString(1, "pqr");
		ps.setString(2,"aaa");
		
		
		int i=ps.executeUpdate();
		if(i>0) {
			System.out.println("yes");
		}
		else {
			System.out.println("not");
		}
		con.close();
		

	}

}
