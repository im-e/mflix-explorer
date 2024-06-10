package com.ime.mflix.model.exception.movies;

public record MoviesResponse(int statusCode, String url, String message) {
}
