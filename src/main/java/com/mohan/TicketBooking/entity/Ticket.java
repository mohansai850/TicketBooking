package com.mohan.TicketBooking.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "PNR")
    private String pnr;

    @Column(name = "list of passengers")
    private String[] passengers;

    @Column(name = "Total Fare")
    private Integer amount;
}
