 package com.highradius.managerImpl;

import java.util.List;

import com.highradius.Dao.ActorDao;
import com.highradius.DaoImpl.ActorDaoImpl;
import com.highradius.pojo.Actor;
import com.highradius.manager.ActorManager;

public class ActorManagerImpl implements ActorManager {
	
	ActorDao actorDao = new ActorDaoImpl();

    public ActorDao getActorDao() {
        return actorDao;
    }

    public void setActorDao(ActorDao actorDao) {
        this.actorDao = actorDao;
    }

    @Override
    public List<Actor> getAllActors() {
        return actorDao.getAllActors();
    }

    @Override
    public int addActor(Actor actor) {
    	if(!actorDao.exist(actor)) {
    		
    		actorDao.addActor(actor);
    	}
        return -1; // Indicates that the actor already exists
    }

    @Override
    public int updateActor(Actor actor) {
        return actorDao.updateActor(actor);
    }

    @Override
    public int deleteActor(Actor actor) {
       return actorDao.deleteActor(actor);
    }
    
}