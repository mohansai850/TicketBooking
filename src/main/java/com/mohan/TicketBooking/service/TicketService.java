package com.mohan.TicketBooking.service;

import com.mohan.TicketBooking.entity.Ticket;
import com.mohan.TicketBooking.repo.ITicketRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TicketService implements ITicketService {

    @Autowired
    private ITicketRepo repo;


    @Override
    public Ticket generateNewTicket(Ticket ticket) {
        return repo.save(ticket);
    }

    @Override
    public List<Ticket> getAllTickets() {
        return repo.findAll();
    }

    @Override
    public Ticket getTicket(Integer id) {
        Optional<Ticket> optional = repo.findById(id);
        return optional.get();
    }

    @Override
    public Ticket updateTicket(Ticket newTicket) {
        return repo.save(newTicket);
    }

    @Override
    public String deleteTicketById(Integer id) {
        repo.deleteById(id);
        return "Deleted";
    }
}
