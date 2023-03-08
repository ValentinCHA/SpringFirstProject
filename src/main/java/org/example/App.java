package org.example;

import org.example.controller.MovieController;
import org.example.repository.FileMovieRepository;
import org.example.service.DefaultMovieService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

       /* MovieController movieController = new MovieController();
        DefaultMovieService movieService = new DefaultMovieService();
        movieController.setMovieService(movieService);
        FileMovieRepository movieRepository = new FileMovieRepository();
        movieService.setMovieRepository(movieRepository);
        movieController.addUsingConsole();*/

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        MovieController movieController = context.getBean(MovieController.class);

        movieController.addUsingConsole();


        System.out.println("Would you like to add another movie? (y/n)");
        Scanner sc = new Scanner(System.in);
        String answer = sc.nextLine();

        if (answer.equals("y")) {
            main(args);
        } else {
            System.out.println("Thank you for using the movie system");
        }
    }
}
