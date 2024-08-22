package com.mohan.TicketBooking.service;

import com.mohan.TicketBooking.entity.Ticket;
import com.mohan.TicketBooking.exception.TicketNotFoundException;
import com.mohan.TicketBooking.repo.ITicketRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class TicketService implements ITicketService {

    @Autowired
    private ITicketRepo repo;


    @Override
    public Ticket generateNewTicket(Ticket ticket) {
        ticket.setAmount(ticket.getPassengers().size() * ticket.getFare());
        ticket.setBookingDateAndTime(LocalDateTime.now());
        return repo.save(ticket);
    }

    @Override
    public List<Ticket> getAllTickets() {
        return repo.findAll();
    }

    @Override
    public Ticket getTicket(Integer id) {
        Optional<Ticket> optional = repo.findById(id);
        if(optional.isPresent()){
            return optional.get();
        } else {
            throw new TicketNotFoundException("Ticket Not Found");
        }
    }

    @Override
    public Ticket updateTicket(Ticket newTicket) {
//        Optional<Ticket> optional = repo.findById(newTicket.getPNR());
        boolean isExists = repo.existsById(newTicket.getPNR());
        if(isExists) {
            return repo.save(newTicket);
        }
        else {
            throw new TicketNotFoundException("Ticket Not Found To Update");
        }
    }

    @Override
    public Ticket deleteTicketById(Integer id) {
        Optional<Ticket> optional = repo.findById(id);
        if(optional.isPresent()) {
            repo.deleteById(id);
            return optional.get();
        } else {
            throw new TicketNotFoundException("Ticket Not Found To Delete");
        }
    }
}
