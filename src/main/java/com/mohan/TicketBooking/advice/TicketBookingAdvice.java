package com.mohan.TicketBooking.advice;

import com.mohan.TicketBooking.exception.TicketNotFoundException;
import com.mohan.TicketBooking.pojo.ErrorDetails;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDateTime;

@RestControllerAdvice
public class TicketBookingAdvice {
    @ExceptionHandler
    public ResponseEntity<ErrorDetails> getTicketNotFoundException(TicketNotFoundException e){
        ErrorDetails error = new ErrorDetails(400, e.getMessage(), LocalDateTime.now());
        return new ResponseEntity<ErrorDetails>(error, HttpStatus.BAD_REQUEST);
    }
    @ExceptionHandler
    public ResponseEntity<ErrorDetails> getException(Exception e){
        ErrorDetails error = new ErrorDetails(503, e.getMessage(), LocalDateTime.now());
        return new ResponseEntity<ErrorDetails>(error, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
