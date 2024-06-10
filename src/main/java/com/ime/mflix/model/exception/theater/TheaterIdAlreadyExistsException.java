package com.ime.mflix.model.exception.theater;

public class TheaterIdAlreadyExistsException extends RuntimeException {
    public TheaterIdAlreadyExistsException(int theaterId){
        super("Theater with Id " + theaterId + " already exists.");
    }
}
