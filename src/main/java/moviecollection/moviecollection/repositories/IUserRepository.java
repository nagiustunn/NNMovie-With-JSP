package moviecollection.moviecollection.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import moviecollection.moviecollection.models.User;

public interface IUserRepository extends JpaRepository<User, Long> {

}
