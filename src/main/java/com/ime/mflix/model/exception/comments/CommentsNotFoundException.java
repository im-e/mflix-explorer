package com.ime.mflix.model.exception.comments;

public class CommentsNotFoundException extends Exception{
    public CommentsNotFoundException(){

         super("There are no comments available at the moment.");
    }
}
