package com.highradius.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ReadCustomer {

	public static void main(String[] args) {

		Connection conn = DBconnection.getConnection();
		
		try {
			Statement statement = conn.createStatement();
			String sql = "SELECT * FROM customer";
			ResultSet rs = statement.executeQuery(sql);
			while(rs.next()) {
				
				int customerid = rs.getInt("customer_id");
				String customer_firstname = rs.getString("firstname");
				System.out.println("Customer Id: "+customerid+", Cutomer First Name: "+customer_firstname);
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
