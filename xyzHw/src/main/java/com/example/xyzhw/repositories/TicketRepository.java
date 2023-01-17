package com.example.xyzhw.repositories;

import com.example.xyzhw.domain.Ticket;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TicketRepository extends MongoRepository<Ticket, String> {
    Ticket save(Ticket t);
    Ticket findTicketByName(String name);
}
