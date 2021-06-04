package moviecollection.moviecollection.services;

import java.util.List;

import moviecollection.moviecollection.models.Admin;

public interface IAdminService {

	List<Admin> getAllAdmin();
	Admin getAdminById(Long id);
}
