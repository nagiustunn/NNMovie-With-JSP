package moviecollection.moviecollection.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import moviecollection.moviecollection.models.Admin;

public interface IAdminRepository extends JpaRepository<Admin, Long> {

}
