package com.example.bookMyShow.Model;

import com.example.bookMyShow.Enum.SeatType;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "theater_seat")
@Data
@NoArgsConstructor
public class ThearterSeatEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(unique = true,columnDefinition = "seat_no",nullable = false)
    private String seatNo;

    @Enumerated(value = EnumType.STRING)
    private SeatType seatType;

    private int rate;
    @ManyToOne
    @JoinColumn
    private TheaterEntity theater;
}
