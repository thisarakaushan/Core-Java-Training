 package com.highradius.DaoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.highradius.Dao.CustomerDao;
import com.highradius.connection.DBConnection;
import com.highradius.pojo.Customer;

public class CustomerDaoImpl implements CustomerDao {

	Connection con = null;
	PreparedStatement ps = null;
	
	@Override
	public int add(Customer customer) {
		
		int result = 0;
		
		con = DBConnection.getConnection();
		String sql = "INSERT INTO customer(firstname, customer_id) VALUES(?,?)";
		
		try {
			
			ps = con.prepareStatement(sql);
			
			// setting the value
			ps.setString(1, customer.getFirstName());
			ps.setInt(2, customer.getCustomerId());
			
			// execute the statement for update
			result = ps.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return result;
	}

	@Override
	public boolean findCustomerById(int customerId) {
		
		con = DBConnection.getConnection();
		
		String sql = "SELECT * FROM customer WHERE customer_id = ?";
		
		try {
			ps  = con.prepareStatement(sql);
			
			ps.setInt(1, customerId);
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				
				return true;
			}
		} catch (Exception e) {

			e.printStackTrace();
		}
		return false;
	}

}
