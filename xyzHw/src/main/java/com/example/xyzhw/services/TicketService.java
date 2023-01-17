package com.example.xyzhw.services;

import com.example.xyzhw.domain.Ticket;

public interface TicketService {
    Ticket save(Ticket t);
    Ticket findTicketByName(String name);
}
