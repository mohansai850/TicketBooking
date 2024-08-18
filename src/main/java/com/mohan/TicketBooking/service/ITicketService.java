package com.mohan.TicketBooking.service;

import com.mohan.TicketBooking.entity.Ticket;

import java.util.List;
import java.util.Optional;

public interface ITicketService {
    Ticket generateNewTicket(Ticket ticket);
    List<Ticket> getAllTickets();
}
