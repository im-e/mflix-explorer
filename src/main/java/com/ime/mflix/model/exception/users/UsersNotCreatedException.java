package com.ime.mflix.model.exception.users;

public class UsersNotCreatedException extends Exception{
    public UsersNotCreatedException(String name){
        super("User: " + name +" could not be created");
    }
}
