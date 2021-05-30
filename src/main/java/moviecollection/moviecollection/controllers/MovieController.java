package moviecollection.moviecollection.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import moviecollection.moviecollection.models.Movie;
import moviecollection.moviecollection.services.MovieService;

@RestController
public class MovieController {
	
	@Autowired
	private MovieService movieService;

	public MovieController(MovieService movieService) {
		super();
		this.movieService = movieService;
	}
	
	@GetMapping("/getAllMovies")
	List<Movie> getAllMovies(){
		return movieService.getAllMovie();
	}
	
	@GetMapping("/getMovieById/{id}")
	Movie one(@PathVariable Long id) {    
	   return movieService.getMovieById(id);
	}
	
	@PostMapping("/createMovie")
	Movie createMovie(@RequestBody Movie newMovie) {
	   return movieService.createMovie(newMovie);
	}
	
	 @PutMapping("/employees/{id}")
	 Movie updateMovie(@RequestBody Movie newMovie, @PathVariable Long id) {
	    return movieService.getMovieById(id);
	   
	 }

}
