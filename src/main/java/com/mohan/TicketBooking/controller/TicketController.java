package com.mohan.TicketBooking.controller;

import com.mohan.TicketBooking.entity.Ticket;
import com.mohan.TicketBooking.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class TicketController {

    @Autowired
    private TicketService service;

    @GetMapping("/greet")
    public String greet(){
        return "Hello";
    }

    @PostMapping("/newticket")
    public ResponseEntity<Ticket> generateNewTicket(@RequestBody Ticket ticket){
        Ticket newTicket = service.generateNewTicket(ticket);
        return new ResponseEntity<Ticket>(newTicket,HttpStatus.OK);
    }
    
    @GetMapping("/tickets")
    public ResponseEntity<List<Ticket>> getAllTickets(){
        List<Ticket> list = service.getAllTickets();
        return new ResponseEntity<List<Ticket>>(list, HttpStatus.OK);
    }
}
