package org.example.repository;

import org.example.entity.Movie;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileMovieRepository implements  MovieRepositoryInterface{

    private MovieRepositoryInterface movieRepository;

    private File file;

    public MovieRepositoryInterface getMovieRepository() {
        return movieRepository;
    }

    public void setMovieRepository(MovieRepositoryInterface movieRepository) {
        this.movieRepository = movieRepository;
    }

    public void add (Movie movie) {

        FileWriter writer;
        try{
            writer=new FileWriter(file,true);
            writer.write(movie.getTitle() + ";");
            writer.write(movie.getGenre() + "\n");
            writer.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }

        System.out.println("The movie "+movie.getTitle()+" has been added.");
    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }
}
