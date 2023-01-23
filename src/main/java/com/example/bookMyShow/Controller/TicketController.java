package com.example.bookMyShow.Controller;

import com.example.bookMyShow.Dtos.TicketRequestDto;
import com.example.bookMyShow.Model.TicketEntity;
import com.example.bookMyShow.Services.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/ticket")
public class TicketController {
    @Autowired
    TicketService ticketService;

    @PostMapping("/create")
    public String createTicket(@RequestBody TicketRequestDto ticketRequestDto) throws Exception{
        return ticketService.createTicket(ticketRequestDto);
    }
    @GetMapping("/all_theaters")
    public List<TicketEntity> allTickets() throws Exception{
        return ticketService.allTicktes();
    }

}
