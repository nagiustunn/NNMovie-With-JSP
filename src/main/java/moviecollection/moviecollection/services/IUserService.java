package moviecollection.moviecollection.services;

import java.util.List;

import moviecollection.moviecollection.models.User;

public interface IUserService {
	
	List<User> getAllUser();
	User getUserById(Long id);	

}
