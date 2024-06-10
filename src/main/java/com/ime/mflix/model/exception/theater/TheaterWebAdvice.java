package com.ime.mflix.model.exception.theater;

import com.ime.mflix.controller.web.TheatersWebController;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice(assignableTypes = {TheatersWebController.class})
public class TheaterWebAdvice {

    @ExceptionHandler({TheaterIdAlreadyExistsException.class, TheaterIdDoesNotExistsException.class})
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public String theaterIdExistsException(RuntimeException e,
                                           HttpServletRequest request,
                                           Model model){
        model.addAttribute("ErrorCode", 400);
        model.addAttribute("error", e);
        model.addAttribute("request", request);
        return "theater-error";
    }
}
