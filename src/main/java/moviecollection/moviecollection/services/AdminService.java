package moviecollection.moviecollection.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import moviecollection.moviecollection.models.Admin;
import moviecollection.moviecollection.repositories.IAdminRepository;

@Service
public class AdminService implements IAdminService {
	
	@Autowired
	private IAdminRepository adminRepository;
	
	@Override
	public List<Admin> getAllAdmin() {
		// TODO Auto-generated method stub
		return adminRepository.findAll();
	}

	@Override
	public Admin getAdminById(Long id) {
		// TODO Auto-generated method stub
		Optional<Admin> optionalAdmin = adminRepository.findById(id);
		Admin admin = null;
		if(optionalAdmin.isPresent()) {
			admin = optionalAdmin.get();
		}
		else {
			throw new RuntimeException("Movie not found for id id: " + id);
		}
		return admin;
	}

}
