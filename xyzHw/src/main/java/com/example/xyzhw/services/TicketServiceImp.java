package com.example.xyzhw.services;

import com.example.xyzhw.domain.Ticket;
import com.example.xyzhw.repositories.TicketRepository;
import org.springframework.stereotype.Service;

@Service
public class TicketServiceImp implements TicketService{
    private final TicketRepository ticketRepository;

    public TicketServiceImp(TicketRepository ticketRepository) {
        this.ticketRepository = ticketRepository;
    }

    @Override
    public Ticket save(Ticket t) {
        return this.ticketRepository.save(t);
    }

    @Override
    public Ticket findTicketByName(String name) {
        return this.ticketRepository.findTicketByName(name);
    }
}
