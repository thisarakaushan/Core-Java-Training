package com.highradius.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DBconnection {
	
	/**
	 * 1. Load Driver Class
	 * 2. Connection Object
	 * 3. Statement
	 * 4. Close Connection
	 */
	
	static Connection connection = null;
	Statement statement = null;
	
	static String url = "jdbc:mysql://localhost:3306/day_10";
	static String username = "root";
	static String password = "root";
	
	public static Connection getConnection() {
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver"); // class.forName - Load the Driver Class
			connection = DriverManager.getConnection(url, username, password);
			System.out.println("Connection was successful.");
			
		} catch (Exception e) {

			System.out.println(e);
		}
		return connection;
	}
}