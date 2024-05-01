package com.demo1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Delete {
	public static void main(String [] aargs) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/java","root","pass123");
		PreparedStatement ps=con.prepareStatement("delete from register where city=?");
		ps.setNString(1,"pqr");
		int i=ps.executeUpdate();
		if(i>0) {
			System.out.println("Delete Succefully");
		}
		else {
			System.out.println("Delete fail");
		}
		
		
	}

}
