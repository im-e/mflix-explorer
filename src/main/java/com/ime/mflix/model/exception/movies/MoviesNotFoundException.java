package com.ime.mflix.model.exception.movies;

public class MoviesNotFoundException extends RuntimeException{
    public MoviesNotFoundException(){
        super("There are no movies available at the moment.");
    }
}
