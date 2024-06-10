package com.ime.mflix.model.exception.comments;

public class CommentIsNullException extends Exception{
public CommentIsNullException(String commentId){
    super("No matching comment found for the given ID: " + commentId + ". Please check the ID and try again.");
}
}
