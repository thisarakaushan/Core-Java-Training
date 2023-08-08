package com.highradius.actions;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.highradius.pojo.Actor;
import com.highradius.manager.ActorManager;

public class ActorAction {
	
	private Actor actor;
	public ActorManager actorManager;
    private List<Actor> actors;
	
    public Actor getActor() {
		return actor;
	}

	public void setActor(Actor actor) {
		this.actor = actor;
	}

    public void setActors(List<Actor> actors) {
        this.actors = actors;
    }

    public List<Actor> getActors() {
        return actors;
    }

    public String getAllActors() {
    	
        @SuppressWarnings("resource")
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        actorManager = (ActorManager) context.getBean("actorManagerImpl");
        
        String msg = "error";

        actors = actorManager.getAllActors();
        if (actors != null) {
            msg = "success";
        }
        return msg;
    }

    public String addActor() {
    	
    	String msg = "ERROR";
    	
    	@SuppressWarnings("resource")
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        actorManager = (ActorManager) context.getBean("actorManagerImpl");
    	
        int result = actorManager.addActor(actor);
        if(result > 0) {
        	msg =  "success";
        }

        return msg;
    }

    public String updateActor() {
    	String msg = "ERROR";
    	
    	@SuppressWarnings("resource")
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        actorManager = (ActorManager) context.getBean("actorManagerImpl");

        int result = actorManager.updateActor(actor);
        if(result > 0) {
        	msg = "success";
        }

        return msg;
    }

    public String deleteActor() {
    	String msg = "ERROR";
  
    	@SuppressWarnings("resource")
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        actorManager = (ActorManager) context.getBean("actorManagerImpl");

        int result = actorManager.deleteActor(actor);
        if(result > 0) {
        	msg = "success";
        }
        return msg;
    }
}