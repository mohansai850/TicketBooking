package com.mohan.TicketBooking.service;

import com.mohan.TicketBooking.entity.Ticket;

import java.util.List;
import java.util.Optional;

public interface ITicketService {
    Ticket generateNewTicket(Ticket ticket);
    List<Ticket> getAllTickets();
    Ticket getTicket(Integer id);
    Ticket updateTicket(Ticket newTicket);
    Ticket deleteTicketById(Integer id);
}
