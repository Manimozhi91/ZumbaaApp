package com.zumba.resource;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbResource {
	private static Connection con;
	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/zumbaapp","root","Manimozhi@123");
			
		}catch(Exception e) {
				System.err.print("Db Connection error..."+e.toString());
		}
	}

	public static Connection getDBConnection() {
		try {
			return con;
		}catch(Exception e) {
			System.err.print("Db Connection error..."+e.toString());
			return null;
		}
		
	}
	public static void closeConnection() {
		try {
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
