package com.mohan.TicketBooking.exception;

public class TicketNotFoundException extends RuntimeException{
    public TicketNotFoundException(String msg) {
        super(msg);
    }
}
