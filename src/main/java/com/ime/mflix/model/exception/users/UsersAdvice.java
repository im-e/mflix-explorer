package com.ime.mflix.model.exception.users;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;


public class UsersAdvice {

       //get
       @ExceptionHandler(UsersNotFoundException.class)
       @ResponseStatus(HttpStatus.BAD_REQUEST)
       public ResponseEntity<UsersErrorResponse> usersNotFoundHandler(
               UsersNotFoundException e,
               HttpServletRequest request){
           UsersErrorResponse response = new UsersErrorResponse(
                   e.getMessage(), 404, request.getRequestURL().toString());

           return ResponseEntity.badRequest().body(response);

       }

       //post
       @ExceptionHandler(UsersNotCreatedException.class)
       @ResponseStatus(HttpStatus.BAD_REQUEST)
       public ResponseEntity<UsersErrorResponse> usersNotCreatedHandler(
               UsersNotCreatedException e,
               HttpServletRequest request) {
           UsersErrorResponse response = new UsersErrorResponse(
                   e.getMessage(), 400, request.getRequestURL().toString());

           return ResponseEntity.badRequest().body(response);
       }

       //put
       @ExceptionHandler(UsersNotUpdatedException.class)
       @ResponseStatus(HttpStatus.BAD_REQUEST)
       public ResponseEntity<UsersErrorResponse> usersNotUpdatedHandler(
               UsersNotUpdatedException e,
               HttpServletRequest request) {
           UsersErrorResponse response = new UsersErrorResponse(
                   e.getMessage(), 400, request.getRequestURL().toString());

           return ResponseEntity.badRequest().body(response);
       }

       //delete
       @ExceptionHandler(UsersNotDeletedException.class)
       @ResponseStatus(HttpStatus.BAD_REQUEST)
       public ResponseEntity<UsersErrorResponse> usersNotDeletedHandler(
               UsersNotDeletedException e,
               HttpServletRequest request) {
           UsersErrorResponse response = new UsersErrorResponse(
                   e.getMessage(), 400, request.getRequestURL().toString());

           return ResponseEntity.badRequest().body(response);
       }



}
