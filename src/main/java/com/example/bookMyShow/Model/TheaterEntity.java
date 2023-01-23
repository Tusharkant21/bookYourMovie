package com.example.bookMyShow.Model;

import jakarta.persistence.*;
import jdk.jfr.Name;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name="theater")
@Data
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class TheaterEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "theater_name", nullable = false)
    private String name;
    private String city;
    private String address;
    //List of shows
    @OneToMany(mappedBy = "theater",cascade = CascadeType.ALL)
    List<ShowEntity> listOfShows;

    // list of Theater seats
    @OneToMany(mappedBy = "theater",cascade = CascadeType.ALL)
    List<ThearterSeatEntity> listOfTheaterSeat;



}
