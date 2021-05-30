package moviecollection.moviecollection.services;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import java.util.List;

import moviecollection.moviecollection.models.Movie;

public interface IMovieService {
	
	List<Movie> getAllMovie();
	Movie getMovieById(Long id);
	void deleteMovie(Long id);
	Movie updateMovie(@RequestBody Movie newMovie, @PathVariable Long id);
	Movie createMovie(@RequestBody Movie newMovie);
}
