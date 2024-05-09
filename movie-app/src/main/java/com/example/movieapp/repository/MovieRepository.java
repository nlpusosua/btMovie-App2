package com.example.movieapp.repository;

import com.example.movieapp.entity.Movie;
import com.example.movieapp.entity.Movie;
import com.example.movieapp.model.enums.MovieType;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;
import java.util.List;

public interface MovieRepository extends JpaRepository<Movie, Integer> {
    List<Movie> findByName(String name);
    List<Movie> findByNameIgnorCase(String name);
    List<Movie> findByNameContaining(String keyword);
    List<Movie> findByNameAndSlug(String name, String slug);
    List<Movie> findByRatingBetween(Double min, Double max);
    List<Movie> findByTypeAndStatus(MovieType type, Boolean status, Sort sort);
    List<Movie> findByRatingLessThanEqual(Double max);
    // sắp xếp
    List<Movie> findByCreatedAtAfter(LocalDateTime createdAT);
    List<Movie> findByTypeOrderByRatingDesc(MovieType type);
    List<Movie> FindByType(MovieType type, Sort sort);
    Movie findFirstByTypeOrderByRatingDesc(MovieType type);
//    đếm số lg
    long countByStatus(Boolean status);
    // kiểm tra tồn tại
    boolean existByName(String name);

    // phân trang

    Page<Movie> findByStatus(Boolean status, Pageable pageable);

}
