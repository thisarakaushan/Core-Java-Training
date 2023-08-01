package com.highradius.jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateCustomer {

	public static void main(String[] args) {
		
		int insert = 0;

		Connection conn = DBconnection.getConnection();
		try {
			
			Statement statement = conn.createStatement();
			String sql = "INSERT INTO customer VALUES('Another string value', 4)";
			insert = statement.executeUpdate(sql);
			if(insert >  0) {
				
				System.out.println("Data inserted!");
			}else {
				
				System.out.println("Something went wrong...");
			}
		} catch (SQLException e1) {

			e1.printStackTrace();
		}finally {
			
			if (conn != null) { 
				try {
					conn.close();
					
				} catch (Exception e) {

					e.printStackTrace();
				}
			}
		}
	}
}
