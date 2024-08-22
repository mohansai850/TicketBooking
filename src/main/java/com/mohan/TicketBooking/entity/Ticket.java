package com.mohan.TicketBooking.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Data
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer PNR;

    private String flightNumber;

//    @ElementCollection
    private List<String> passengers;

    private Integer fare;

    private Integer amount;

    @Column(name = "Date of Journey")
    private LocalDate doj;

    private LocalDateTime bookingDateAndTime;
}
