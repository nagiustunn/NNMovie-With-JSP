package moviecollection.moviecollection.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import moviecollection.moviecollection.models.ActorActrees;
import moviecollection.moviecollection.repositories.IActorActreesRepository;

@Service
public class ActorActreesService implements IActorActreesService {

	@Autowired
	private IActorActreesRepository actorActreesRepository;
	
	@Override
	public List<ActorActrees> getAllActorActrees() {
		// TODO Auto-generated method stub
		return actorActreesRepository.findAll();
	}

	@Override
	public ActorActrees getActorActreesById(Long id) {
		// TODO Auto-generated method stub
		Optional<ActorActrees> optionalActorActrees = actorActreesRepository.findById(id);
		ActorActrees actorActrees = null;
		if(optionalActorActrees.isPresent()) {
			actorActrees = optionalActorActrees.get();
		}
		else {
			throw new RuntimeException("Actor/Actrees not found for id id: " + id);
		}
		return actorActrees;
	}

	@Override
	public void deleteActorActrees(Long id) {
		// TODO Auto-generated method stub
		actorActreesRepository.deleteById(id);
	}

	@Override
	public ActorActrees updateActorActrees(ActorActrees newActorActrees, Long id) {
		// TODO Auto-generated method stub
		return actorActreesRepository.findById(id)
				.map(actorActrees -> {
					actorActrees.setName(newActorActrees.getName());
					actorActrees.setSurname(newActorActrees.getSurname());
					actorActrees.setRole(newActorActrees.getRole());
					return actorActreesRepository.save(newActorActrees);
				}).orElseGet(() -> {
					newActorActrees.getId();
					return actorActreesRepository.save(newActorActrees);
				});
	}

	@Override
	public ActorActrees createActorActrees(ActorActrees newActorActrees) {
		// TODO Auto-generated method stub
		return actorActreesRepository.save(newActorActrees);
	}

	
	

}
