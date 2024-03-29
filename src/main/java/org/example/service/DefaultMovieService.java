package org.example.service;

import org.example.entity.Movie;
import org.example.repository.MovieRepositoryInterface;
import org.springframework.beans.factory.annotation.Autowired;


public class DefaultMovieService implements MovieServiceInterface {

    @Autowired
    private MovieRepositoryInterface movieRepository;

    public MovieRepositoryInterface getMovieRepository() {
        return movieRepository;
    }

    public void setMovieRepository(MovieRepositoryInterface movieRepository) {
        this.movieRepository = movieRepository;
    }

    public void registerMovie(Movie movie) {
        movieRepository.add(movie);
    }
}
