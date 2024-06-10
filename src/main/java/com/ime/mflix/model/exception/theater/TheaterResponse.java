package com.ime.mflix.model.exception.theater;

public class TheaterResponse {
    private String message;
    private String url;
    private int statusCode;

    public TheaterResponse(String message, int statusCode, String url){
        this.message = message;
        this.statusCode = statusCode;
        this.url = url;
    }
}
