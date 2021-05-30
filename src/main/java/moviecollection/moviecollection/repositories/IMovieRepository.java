package moviecollection.moviecollection.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import moviecollection.moviecollection.models.Movie;

public interface IMovieRepository extends JpaRepository<Movie, Long> {

}
