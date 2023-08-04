package com.highradius.DaoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.highradius.Dao.CustomerDao;
import com.highradius.beans.Customer;
import com.highradius.connection.DBConnection;

public class CustomerDaoImpl implements CustomerDao {
	Connection connection = null;
	PreparedStatement preparedStatement = null;

	@Override
	public List<Customer> getCustomers() {
		String sql = "SELECT * FROM customer";
		connection = DBConnection.getConnection();
		List<Customer> customers = new ArrayList<Customer>();
		try {
			preparedStatement = connection.prepareStatement(sql);
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				customers.add(new Customer(resultSet.getString("firstname"), resultSet.getInt("customer_id")));
			}
			return customers;
		} catch (Exception e) {
			System.out.println("error");
			return customers;
		}
	}

}
