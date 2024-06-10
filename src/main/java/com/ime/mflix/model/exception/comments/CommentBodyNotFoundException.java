package com.ime.mflix.model.exception.comments;

public class CommentBodyNotFoundException extends Exception {
     public CommentBodyNotFoundException() {
         super("The comment body is missing from the request. Please include a comment and try again.");
     }
}
