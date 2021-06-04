package moviecollection.moviecollection.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import moviecollection.moviecollection.models.User;
import moviecollection.moviecollection.repositories.IUserRepository;

@Service
public class UserService implements IUserService{

	@Autowired
	private IUserRepository userRepository;
	
	@Override
	public List<User> getAllUser() {
		// TODO Auto-generated method stub
		return userRepository.findAll();
	}

	@Override
	public User getUserById(Long id) {
		// TODO Auto-generated method stub
		Optional<User> optionalUser = userRepository.findById(id);
		User user = null;
		if(optionalUser.isPresent()) {
			user = optionalUser.get();
		}
		else {
			throw new RuntimeException("Movie not found for id id: " + id);
		}
		return user;
	}


}
