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

    @PostMapping("/newTicket")
    public ResponseEntity<Ticket> generateNewTicket(@RequestBody Ticket ticket){
        Ticket newTicket = service.generateNewTicket(ticket);
        return new ResponseEntity<Ticket>(newTicket,HttpStatus.CREATED);
    }
    
    @GetMapping("/tickets")
    public ResponseEntity<List<Ticket>> getAllTickets(){
        List<Ticket> list = service.getAllTickets();
        return new ResponseEntity<List<Ticket>>(list, HttpStatus.OK);
    }

    @GetMapping("/ticket/{id}")
    public ResponseEntity<Ticket> getTicket(@PathVariable Integer id){
        Ticket ticket = service.getTicket(id);
        return new ResponseEntity<Ticket>(ticket, HttpStatus.OK);
    }

    @PatchMapping("/updateTicketDetails")
    public ResponseEntity<Ticket> updateTicket(@RequestBody Ticket newTicket){
        Ticket updatedTicket = service.updateTicket(newTicket);
        return new ResponseEntity<Ticket>(updatedTicket, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Ticket> deleteById(@PathVariable Integer id){
        Ticket deletedTicket = service.deleteTicketById(id);
        return new ResponseEntity<Ticket>(deletedTicket,HttpStatus.OK);
    }
}
