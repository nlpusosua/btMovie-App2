//package com.example.movieapp;
//
//import com.example.movieapp.entity.Movie;
//import com.example.movieapp.entity.Movie;
//import com.example.movieapp.model.enums.MovieType;
//import com.example.movieapp.repository.MovieRepository;
//import com.example.movieapp.repository.MovieRepository;
//import com.github.javafaker.Faker;
//import com.github.slugify.Slugify;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.PageRequest;
//
//import java.time.LocalDateTime;
//import java.util.List;
//import java.util.Random;
//
//@SpringBootTest
//class MovieAppApplicationTests {
//    @Autowired
//    private MovieRepository moviesRepository;
//    @Test
//    void save_movies() {
//        Random random = new Random();
//        Faker faker = new Faker();
//        Slugify slugify = Slugify.builder().build();
//
//        for (int i = 0; i < 100; i++) {
//            String name = faker.book().title();
//            Movie movie = Movie.builder()
//                    .name(name)
//                    .slug(slugify.slugify(name))
//                    .description(faker.lorem().paragraph())
//                    .releaseYear(faker.number().numberBetween(2020, 2024))
//                    .rating(faker.number().randomDouble(1, 1, 10))
//                    .type(MovieType.values()[random.nextInt(MovieType.values().length)])
//                    .status(faker.bool().bool())
//                    .trailer("https://www.youtube.com/embed/4ut5gMzZLgY?si=ulVi9jTCS8-fH9AZ")
//                    .createdAt(LocalDateTime.now())
//                    .updatedAt(LocalDateTime.now())
//                    .build();
//            moviesRepository.save(movie);
//        }
//
//    }
//
////    @Test
////    void test_movie_query(){
//////        List<Movies> movies = moviesRepository.findAll();
//////        System.out.println("Sum movies: " +movies.size());
////
////        // select *from movies where id in (1,2,3)
////        List movieById = moviesRepository.findAllById(List.of(1,2,3));
////        System.out.println("Sum movies by list ID: " + movieById.size());
////
////        // select * from movies where id =1
////        Movie movie= moviesRepository.findById(1).orElse(null);
////        System.out.println("Movie: "+ movie);
////
////        // update
//////        movie.setName("Lật đổ");
//////        moviesRepository.save(movie);
////
//////        // delete
//////        moviesRepository.findById(1);
//////        moviesRepository.delete(movie);
//////        moviesRepository.deleteAll();
//////        moviesRepository.deleteAllById(List.of(1,2,3));
//
//        @Test
//    void test_pageination(){
//            PageRequest pageRequest= PageRequest.of(0,10);
//            Page<Movie> page = moviesRepository.findByStatus(true, pageRequest);
//
//            System.out.println("total pages" +page.getTotalPages());
//
//    }
//
//}
