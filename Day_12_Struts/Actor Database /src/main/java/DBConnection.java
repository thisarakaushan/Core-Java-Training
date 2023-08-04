package com.highradius.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	
	public static Connection getConnection() throws SQLException {
		
		try {
			String url = "jdbc:mysql://localhost:3306/sakila";
			String username = "root";
			String pasword = "root";
			Class.forName("com.mysql.cj.jdbc.Driver");
			return DriverManager.getConnection(url, username, pasword);
			
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		}
		return null;
	}
}
