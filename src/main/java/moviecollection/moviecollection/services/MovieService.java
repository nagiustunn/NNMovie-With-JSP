package moviecollection.moviecollection.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import moviecollection.moviecollection.models.Movie;
import moviecollection.moviecollection.repositories.IMovieRepository;

@Service
public class MovieService implements IMovieService {
	
	@Autowired
	private IMovieRepository movieRepository;

	public MovieService(IMovieRepository movieRepository) {
		super();
		this.movieRepository = movieRepository;
	}

	@Override
	public List<Movie> getAllMovie() {
		// TODO Auto-generated method stub
		return movieRepository.findAll();
	}

	@Override
	public Movie getMovieById(Long id) {
		// TODO Auto-generated method stub
		Optional<Movie> optionalMovie = movieRepository.findById(id);
		Movie movie = null;
		if(optionalMovie.isPresent()) {
			movie = optionalMovie.get();
		}
		else {
			throw new RuntimeException("Movie not found for id id: " + id);
		}
		return movie;
	}

	@Override
	public void deleteMovie(Long id) {
		// TODO Auto-generated method stub
		movieRepository.deleteById(id);
	}

	@Override
	public Movie updateMovie(Movie newMovie, Long id) {
		// TODO Auto-generated method stub
		return movieRepository.findById(id)
				.map(movie -> {
					movie.setName(newMovie.getName());
					movie.setDescription(newMovie.getDescription());
					movie.setImagePath(newMovie.getImagePath());
					movie.setLanguage(newMovie.getLanguage());
					movie.setPubYear(newMovie.getPubYear());
					movie.setType(newMovie.getType());
					return movieRepository.save(movie);
				}).orElseGet(() -> {
					newMovie.getId();
					return movieRepository.save(newMovie);
				});
	}

	@Override
	public Movie createMovie(Movie newMovie) {
		// TODO Auto-generated method stub
		return movieRepository.save(newMovie);
	}

}
