package com.ime.mflix.model.exception.movies;

public class RequestBodyNotFoundException extends RuntimeException{
    public RequestBodyNotFoundException() {
      super("The request body is missing or incomplete. Please provide a valid movie object with all required fields.");
    }
}
