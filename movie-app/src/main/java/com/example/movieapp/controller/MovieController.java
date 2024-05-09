package com.example.movieapp.controller;

import com.example.movieapp.model.enums.MovieType;
import com.example.movieapp.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MovieController {
    @Autowired
    private MovieService movieService;

    @GetMapping("/phimmoi")
    public String getPhimMoi(Model model) {
        model.addAttribute("movies", movieService.getMovieByType(MovieType.PHIM_BO, true, Sort.by("createdAt").descending()));
        return "phimmoi";
    }

    @GetMapping("/blog")
    public String getBlog(Model model) {
        model.addAttribute("movies", movieService.getMovieByType(MovieType.PHIM_LE, true, Sort.by("createdAt").descending()));
        return "blog";
    }

    @GetMapping("/chi-tiet-phim")
    public String getChiTietPhim(Model model) {
        model.addAttribute("movies", movieService.getMovieByType(MovieType.PHIM_CHIEU_RAP, true, Sort.by("createdAt").descending()));
        return "chitietphim";
    }

}
