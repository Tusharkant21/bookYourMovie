package com.example.bookMyShow.Model;

import com.example.bookMyShow.Enum.SeatType;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Table(name="show_seats")
@Data
@NoArgsConstructor
public class ShowSeatsEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

     private int rate;
     private String seatNo;

     @Enumerated(value = EnumType.STRING)
     private SeatType seatType;

     private boolean booked;
     private Date bookedAt;

     @ManyToOne
     @JoinColumn
     private ShowEntity show;

     @ManyToOne
    @JoinColumn
    private TicketEntity ticket;


}
