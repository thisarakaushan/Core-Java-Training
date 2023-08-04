package com.highradius.action;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.highradius.connection.DBConnection;
import com.highradius.model.User;

public class Action {
	
	private int actor_id;
	private String first_name;
	private String last_name;
	private String msg;
	
	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public int getActor_id() {
		return actor_id;
	}

	public void setActor_id(int actor_id) {
		this.actor_id = actor_id;
	}

	public String getFirstname() {
		return first_name;
	}

	public void setFirstname(String first_name) {
		this.first_name = first_name;
	}

	public String getLastname() {
		return last_name;
	}

	public void setLastname(String last_name) {
		this.last_name = last_name;
	}

	private List<User> actor = new ArrayList<User>();

	public List<User> getActor() {
		return actor;
	}

	public void setActor(List<User> actor) {
		this.actor = actor;
	}

	public String dataLoading() {		
		
		try{
			Connection con = DBConnection.getConnection();
			Statement stat = con.createStatement();
			String sql = "SELECT * FROM actor";
			ResultSet rs = stat.executeQuery(sql);
			
			while(rs.next()) {
				actor.add(new User(rs.getInt("actor_id"), rs.getString("first_name"), rs.getString("last_name")));		
				setMsg("success");
			}
			stat.close();
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
			setMsg("error");
		}
		return msg;
	}
	
	public String readRows() {
		
		String fullName = null;
		
		try {
			Connection con = DBConnection.getConnection();
			String sql = "SELECT CONCAT(first_name, ' ', last_name) AS full_name FROM actor";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, actor_id);
			ResultSet rs = ps.executeQuery();
			
			if(rs.next()) {
				fullName = rs.getString("full_name");
			}
			ps.close();
			con.close();
			
		} catch (SQLException e) {

			e.printStackTrace();
			setMsg("error");
		}
		
		return fullName;
	}
	
	public String addRows() {

		try {
			Connection con = DBConnection.getConnection();
			String sql = "INSERT INTO actor(first_name, last_name) VALUES(?, ?)";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, first_name);
			ps.setString(2, last_name);
			
			int result = ps.executeUpdate();
			if(result == 1) {
				
				setMsg("success");
			}
			ps.close();
			con.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
			setMsg("error");
		}
		return msg;
	}
	
	public String updateRows() {
		
		try {		
			String sql = "UPDATE actor SET first_name=?, last_name=? WHERE actor_id = ?";
			Connection con = DBConnection.getConnection();
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, first_name);
			ps.setString(2, last_name);
			ps.setInt(3, actor_id);
			
			int result = ps.executeUpdate();
			if(result == 0) {
				
				setMsg("success");
			}
			ps.close();
			con.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
			setMsg("error");
		}
		return msg;
	}
	
	public String deleteRows() {

		try {
			String sql = "DELETE FROM actor WHERE actor_id=?";
			Connection con = DBConnection.getConnection();
			 PreparedStatement ps = con.prepareStatement(sql);
			
			ps.setInt(1, actor_id);
			int result = ps.executeUpdate();
			if(result == 0) {
				
				setMsg("success");
			}
			ps.close();
			con.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
			setMsg("error");
		} 
		return msg;
	}

}

