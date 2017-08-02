package com.rtwitty.movieproject.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.rtwitty.movieproject.models.Movie;

@Repository
public interface MovieRepository extends CrudRepository<Movie, Long>{
}
