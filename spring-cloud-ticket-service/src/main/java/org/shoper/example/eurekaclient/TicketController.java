package org.shoper.example.eurekaclient;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ShawnShoper on 2017/6/27.
 */
@RestController
public class TicketController {
    @GetMapping("/ticket/{uid}")
    public Ticket findTicketByUserId(@PathVariable("uid") String uid){
        Ticket ticket = new Ticket();
        ticket.setUserId(uid);
        ticket.setId("1");
        ticket.setAddress("cheng du");
        return ticket;
    }
}
