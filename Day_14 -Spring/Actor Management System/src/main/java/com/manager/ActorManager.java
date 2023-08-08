package com.highradius.manager;

import java.util.List;
import com.highradius.pojo.Actor;

public interface ActorManager {
	
    List<Actor> getAllActors();
    
    int addActor(Actor actor);

    int updateActor(Actor actor);

	int deleteActor(Actor actor);
}