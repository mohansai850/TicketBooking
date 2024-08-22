package com.mohan.TicketBooking.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;

//@Entity
@Data
public class Passenger {
//    @Id
    private Integer id;
    private String name;
    private Integer age;
    private String gender;
}
