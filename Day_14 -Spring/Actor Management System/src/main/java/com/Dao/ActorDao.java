package com.highradius.Dao;

import java.util.List;
import com.highradius.pojo.Actor;

public interface ActorDao {
	
    List<Actor> getAllActors();

    int addActor(Actor actor);

    int updateActor(Actor actor);

    int deleteActor(Actor actor);

	boolean exist(Actor actor);
}