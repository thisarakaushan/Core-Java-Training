package com.highradius.action;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.highradius.customer.Customer;

public class Action {
	
	List<Customer> customers = null;
	
	private void readData() {
		
		Connection con  = null;
		PreparedStatement ps = null;
		
		try {
			
			String url = "jdbc:mysql://localhost:3306/day_10";
			String username = "root";
			String password = "root";
			
			Class.forName("com.mysql.cj.jdbc.Driver"); 
			con = DriverManager.getConnection(url, username, password);  
			  
			String sql = "SELECT * FROM customer";
			
			System.out.println("Connection was successful.");
			
			ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			customers = new ArrayList<Customer>();
			while(rs.next()) {
				
				customers.add(new Customer(rs.getString("firstname"), rs.getInt("customer_id")));
			}
			for(Customer customer: customers) {
				
				System.out.println("Customer Id: "+customer.getCustomer_id()+", Firstname: "+customer.getFirstname());
			}
		} catch (SQLException | ClassNotFoundException e) {

			e.printStackTrace();
		}
		finally {
			if(con != null) {
				try {
					con.close();
					
				} catch(Exception e1) {
					e1.printStackTrace();
				}
			}
		}
	}

	public String execute() throws Exception{
		
		readData();
		return "success";
	} 
	
	public List<Customer> getCustomers(){
		
		return customers;
	}
}
