package moviecollection.moviecollection.services;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import moviecollection.moviecollection.models.ActorActrees;

public interface IActorActreesService {

	List<ActorActrees> getAllActorActrees();
	ActorActrees getActorActreesById(Long id);
	void deleteActorActrees(Long id);
	ActorActrees updateActorActrees(@RequestBody ActorActrees newActorActrees, @PathVariable Long id);
	ActorActrees createActorActrees(@RequestBody ActorActrees newActorActrees);
}
