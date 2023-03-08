package org.example.repository;

import org.example.entity.Movie;

import java.util.ArrayList;
import java.util.List;

public class MemoryMovieRepository implements MovieRepositoryInterface {

    private MovieRepositoryInterface movieRepository;

    public MovieRepositoryInterface getMovieRepository() {
        return movieRepository;
    }

    public void setMovieRepository(MovieRepositoryInterface movieRepository) {
        this.movieRepository = movieRepository;
    }

    private List<Movie> movies = new ArrayList<>();

    public void add (Movie movie) {
        movies.add(movie);
        System.out.println("The movie "+movie.getTitle()+" has been added.");
    }
}
