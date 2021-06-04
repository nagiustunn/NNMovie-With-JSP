package moviecollection.moviecollection.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import moviecollection.moviecollection.models.User;
import moviecollection.moviecollection.services.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService userService;
	
	@GetMapping("/getAllUsers")
	List<User> getAllUsers(){
		return userService.getAllUser();
	}
	
	@GetMapping("/getUserById/{id}")
	User one(@PathVariable Long id) {    
	   return userService.getUserById(id);
	}
	
}
