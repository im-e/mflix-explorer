package com.ime.mflix.model.exception.users;

public class UsersNotUpdatedException extends Exception{
    public UsersNotUpdatedException(String name){
        super("User: " + name +" could not be updated!");
    }
}
