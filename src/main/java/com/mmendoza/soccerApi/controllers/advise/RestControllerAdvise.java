package com.mmendoza.soccerApi.controllers.advise;

import com.mmendoza.soccerApi.entities.exceptions.models.ErrorResponse;
import com.mmendoza.soccerApi.entities.exceptions.NotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.LocalDateTime;

@ControllerAdvice
public class RestControllerAdvise {
    @ExceptionHandler(value = NotFoundException.class)
    public ResponseEntity<ErrorResponse> handleNotFoundException(NotFoundException exception) {
        ErrorResponse error = ErrorResponse.builder().message(exception.getMessage()).timestamp(LocalDateTime.now()).build();
        return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
    }
}
