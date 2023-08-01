package com.highradius.jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteCustomer {

	public static void main(String[] args) {

		int deleteCount = 0;
		Connection conn = DBconnection.getConnection();
		
		try {
			Statement statement = conn.createStatement();
			String sql = "DELETE FROM customer WHERE customer_id = 5";
			deleteCount = statement.executeUpdate(sql);
			if (deleteCount > 0) {
				System.out.println("Data Deleted!");
				
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
