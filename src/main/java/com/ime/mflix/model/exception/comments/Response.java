package com.ime.mflix.model.exception.comments;

public record Response(int statusCode, String url, String message) {
}
