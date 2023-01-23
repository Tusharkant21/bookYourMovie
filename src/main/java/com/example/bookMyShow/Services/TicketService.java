package com.example.bookMyShow.Services;

import com.example.bookMyShow.Dtos.TicketRequestDto;
import com.example.bookMyShow.Model.TicketEntity;
import com.example.bookMyShow.Repository.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TicketService {
    @Autowired
    TicketRequestDto ticketRequestDto;
    @Autowired
    TicketRepository ticketRepository;
    public String createTicket(TicketRequestDto ticketRequestDto) throws Exception{
        TicketEntity ticketEntity = TicketEntity.builder().allotedSeat(ticketRequestDto.getAllotedSeat()).amount(ticketRequestDto.getAmount()).build();
        ticketRepository.save(ticketEntity);
        return "Ticket created sucessfully";
    }



    public List<TicketEntity> allTicktes() throws Exception {
        return  ticketRepository.findAll();
    }
}
