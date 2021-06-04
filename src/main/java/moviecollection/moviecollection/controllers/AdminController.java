package moviecollection.moviecollection.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import moviecollection.moviecollection.models.Admin;
import moviecollection.moviecollection.services.AdminService;

@RestController
public class AdminController {
	
	@Autowired
	private AdminService adminService;
	
	@GetMapping("/getAllAdmins")
	List<Admin> getAllAdmins(){
		return adminService.getAllAdmin();
	}
	
	Admin one(@PathVariable Long id) {    
	   return adminService.getAdminById(id);
	}
}
