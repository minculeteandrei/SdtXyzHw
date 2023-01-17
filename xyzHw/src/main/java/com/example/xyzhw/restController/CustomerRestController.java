package com.example.xyzhw.restController;

import com.example.xyzhw.domain.Ticket;
import com.example.xyzhw.services.TicketService;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@CrossOrigin
@RequestMapping(value = "/xyz/tickets", produces = "application/xml")
public class CustomerRestController {
    private final TicketService ticketService;
    private RestTemplate restTemplate;
    private HttpHeaders headers;

    public CustomerRestController(TicketService ticketService, RestTemplate restTemplate) {
        this.ticketService = ticketService;
        this.restTemplate = restTemplate;
    }

    @PostMapping("/")
    public ResponseEntity<?> postTicket(@RequestBody Ticket t) {
        Ticket temp = this.ticketService.save(t);
        headers = new HttpHeaders();

        HttpEntity<Ticket> request = new HttpEntity<>(temp, headers);
        String url = "http://localhost:8000/newProblemTicket/";
        ResponseEntity<?> result = restTemplate.postForEntity(url, request, Object.class);
        return new ResponseEntity<>(headers, HttpStatus.OK);
    }
}
