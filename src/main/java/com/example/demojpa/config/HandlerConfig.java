package com.example.demojpa.config;

import com.example.demojpa.exceptions.PersonNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class HandlerConfig {

    @ExceptionHandler(PersonNotFoundException.class)
    public ResponseEntity HandlePersonNotfoundException(PersonNotFoundException ex)
    {
        return new ResponseEntity(ex.getMessage(), HttpStatus.BAD_REQUEST);


    }

}
