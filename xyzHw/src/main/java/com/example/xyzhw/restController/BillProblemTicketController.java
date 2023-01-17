package com.example.xyzhw.restController;

import com.example.xyzhw.domain.Bill;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/xyz/billProblemTicket")
public class BillProblemTicketController {
    @PostMapping(value = "/", consumes = {MediaType.APPLICATION_XML_VALUE})
    public ResponseEntity<?> postBill(@RequestBody Bill bill) {
        System.out.println("bill: " + bill.toString());
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
