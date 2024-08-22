package com.mohan.TicketBooking.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
public class ErrorDetails {
    private Integer errorCode;
    private String errorMessage;
    private LocalDateTime time;
}
