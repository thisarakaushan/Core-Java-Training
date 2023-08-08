package com.highradius.DaoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.highradius.Dao.ActorDao;
import com.highradius.pojo.Actor;
import com.highradius.connection.DBConnection;

public class ActorDaoImpl implements ActorDao {
	
    Connection connection = null;
    PreparedStatement preparedStatement = null;

    @Override
    public List<Actor> getAllActors() {
        String sql = "SELECT actor_id, first_name, last_name FROM actor";
        connection = DBConnection.getConnection();
        List<Actor> actors = new ArrayList<>();
        try {
            preparedStatement = connection.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                Actor actor = new Actor();
                actor.setActorId(resultSet.getInt("actor_id"));
                actor.setFirstName(resultSet.getString("first_name"));
                actor.setLastName(resultSet.getString("last_name"));
                actors.add(actor);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return actors;
    }

    @Override
    public boolean exist(Actor actor) {
    	
    	boolean found = false;
    	
        String sql = "SELECT * FROM actor WHERE first_name=? AND last_name=?";
        connection = DBConnection.getConnection();
        try {
            preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setString(1, actor.getFirstName());
            preparedStatement.setString(2, actor.getLastName());
            ResultSet resultSet = preparedStatement.executeQuery();
           while (resultSet.next()) {
         
                found = true;
            }
           connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return found;
    }

    @Override
    public int addActor(Actor actor) {
    	
    	int result;
        String sql = "INSERT INTO actor (first_name, last_name) VALUES (?, ?)";
        connection = DBConnection.getConnection();
        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, actor.getFirstName());
            preparedStatement.setString(2, actor.getLastName());	
            result = preparedStatement.executeUpdate(); 
            preparedStatement.close(); 

            return result;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    @Override
    public int updateActor(Actor actor) {
    	
        String sql = "UPDATE actor SET first_name=?, last_name=? WHERE actor_id=?";
        connection = DBConnection.getConnection();
        try {
            preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setString(1, actor.getFirstName());
            preparedStatement.setString(2, actor.getLastName());
            preparedStatement.setInt(3, actor.getActorId());
            int result = preparedStatement.executeUpdate();
            
            preparedStatement.close();
            connection.close();
            return result;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
		
    }

    @Override
    public int deleteActor(Actor actor) {
        String sql = "DELETE FROM actor WHERE actor_id=?";
        connection = DBConnection.getConnection();
        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, actor.getActorId());
            int result = preparedStatement.executeUpdate();
            
            preparedStatement.close();
            connection.close();
            
            return result;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
        
    }

}