package com.highradius.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DBConnection {
	/*
	 * 1. Load Driver Class 2. Connection Object 3. Statement 4. Close Connection
	 * 
	 */
	static Connection connection = null;
	Statement statement = null;
	static String url = "jdbc:mysql://localhost:3306/sakila";
	static String username = "root";
	static String password = "root";

	public static Connection getConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection(url, username, password);
			System.out.println("connection was successful!");
		} catch (Exception e) {
			System.out.println(e);
		}
		return connection;
	}
}