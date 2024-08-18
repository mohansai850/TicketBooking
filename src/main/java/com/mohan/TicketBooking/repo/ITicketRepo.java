package com.mohan.TicketBooking.repo;

import com.mohan.TicketBooking.entity.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITicketRepo extends JpaRepository<Ticket, String> {
}
