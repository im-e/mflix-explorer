package com.ime.mflix.model.exception.movies;

public class MovieIdNotFoundException extends RuntimeException {
    public MovieIdNotFoundException(String movieId) {

        super("Movie with ID " + movieId + " not found. Please check the ID and try again.");
    }
}