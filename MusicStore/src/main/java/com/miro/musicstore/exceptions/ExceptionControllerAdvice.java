package com.miro.musicstore.exceptions;

import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionControllerAdvice {

    @ExceptionHandler
    public ResponseEntity<String> handleArtistNotFoundException(ArtistNotFoundException exception) {

        return new ResponseEntity<>(exception.getMessage(), HttpStatusCode.valueOf(404));

    }

}
