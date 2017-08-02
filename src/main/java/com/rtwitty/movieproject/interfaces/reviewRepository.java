package com.rtwitty.movieproject.interfaces;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.rtwitty.movieproject.models.Review;

@Repository
public interface reviewRepository extends CrudRepository<Review, Long>{
}
