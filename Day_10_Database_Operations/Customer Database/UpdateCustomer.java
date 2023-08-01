package com.highradius.jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateCustomer {

	public static void main(String[] args) {

		int updateCount = 0;
		Connection conn = DBconnection.getConnection();
		
		try {
			Statement statement = conn.createStatement();
			String sql = "UPDATE customer SET firstname = 'Updated_to_IBM'	WHERE customer_id = 4";
			updateCount = statement.executeUpdate(sql);
			if (updateCount > 0) {
				System.out.println("Data Updated!");
				
			}else {
				
				System.out.println("Something went wrong...");
			}
			
		} catch (SQLException e) {

			e.printStackTrace();
		}
		finally {
			if(conn != null) {
				try {
					conn.close();
					
				} catch(Exception e1) {
					e1.printStackTrace();
				}
			}
		}
	}
}
