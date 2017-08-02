package com.rtwitty.movieproject.models;

public class Review {

    private String reviewer;
    private String movie;
    private int rating;
    private int reviewerAge;
    private String reviewerGender;
    private String reviewerOccupation;

    public Review() {
    }

    public String getReviewer() {
        return reviewer;
    }

    public void setReviewer(String reviewer) {
        this.reviewer = reviewer;
    }

    public String getMovie() {
        return movie;
    }

    public void setMovie(String movie) {
        this.movie = movie;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public int getReviewerAge() {
        return reviewerAge;
    }

    public void setReviewerAge(int reviewerAge) {
        this.reviewerAge = reviewerAge;
    }

    public String getReviewerGender() {
        return reviewerGender;
    }

    public void setReviewerGender(String reviewerGender) {
        this.reviewerGender = reviewerGender;
    }

    public String getReviewerOccupation() {
        return reviewerOccupation;
    }

    public void setReviewerOccupation(String reviewerOccupation) {
        this.reviewerOccupation = reviewerOccupation;
    }
}
