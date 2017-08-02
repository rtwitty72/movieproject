package com.rtwitty.movieproject.controllers;


import com.rtwitty.movieproject.interfaces.MovieRepository;
import org.springframework.ui.Model;
import com.rtwitty.movieproject.models.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class MovieController {

    @Autowired
    MovieRepository repo;


    @RequestMapping("/")
    public String index(Model model) {
        Iterable<Movie> movies = repo.findAll();
        model.addAttribute("movies", movies);
        return "index";
    }

//    @RequestMapping(value = "/createMovie", method = RequestMethod.POST)
//        public String createMovie(@RequestParam("title")String title,
//                                  @RequestParam("genre")String genre,
//                                  @RequestParam("link")String link,
//                                  @RequestParam("date")String date){
//        Movie movie = new Movie(title, genre, link, date);
//        repo.save(movie);
//        return "redirect:/";
//    }
//
//
}
