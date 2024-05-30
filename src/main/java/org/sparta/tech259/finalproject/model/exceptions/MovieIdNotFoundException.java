package org.sparta.tech259.finalproject.model.exceptions;

public class MovieIdNotFoundException extends Exception {
    public MovieIdNotFoundException(String movieId) {
        super(" Movie with ID:  "  + movieId +  " not found. Please verify the provided ID and try again.");
    }
}
