package com.example.franchise.restControllers;

import com.example.franchise.domain.Bill;
import com.example.franchise.domain.Ticket;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@CrossOrigin
@RequestMapping(value = "/newProblemTicket")
public class NewProblemTicketController {
    private HttpHeaders httpHeaders;
    private final RestTemplate restTemplate;
    private HttpHeaders headers;

    public NewProblemTicketController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @PostMapping(value = "/", consumes = {MediaType.APPLICATION_XML_VALUE})
    public ResponseEntity<?> postNewTicket(@RequestBody Ticket t) {
        System.out.println("new report: " + t.toString());

        Bill bill = new Bill(t.getId(), 50, "work done");
        headers = new HttpHeaders();
        String url = "http://localhost:8080/xyz/billProblemTicket/";

        HttpEntity<Bill> request = new HttpEntity<>(bill, headers);
        ResponseEntity<?> result = restTemplate.postForEntity(url, request, Object.class);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
