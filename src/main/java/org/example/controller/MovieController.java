package org.example.controller;

import org.example.entity.Movie;
import org.example.service.MovieServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Scanner;

public class MovieController {

    @Autowired
    private MovieServiceInterface movieService;

    public MovieServiceInterface getMovieService() {
        return movieService;
    }

    public void setMovieService(MovieServiceInterface movieService) {
        this.movieService = movieService;
    }

    public void addUsingConsole () {
        System.out.println("Please type the title and the genre of the movie you want to add");
        Scanner sc = new Scanner(System.in);
        String title = sc.nextLine();
        String genre = sc.nextLine();
        Movie movie = new Movie();
        movie.setTitle(title);
        movie.setGenre(genre);
        movieService.registerMovie(movie);
    }
}
