package com.example.bookMyShow.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.util.Date;
import java.util.List;

@Entity
@Table(name="tickets")
@Data
@Builder
@AllArgsConstructor
public class TicketEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String allotedSeat;
    private  int amount;

    @CreationTimestamp
    @Temporal(value = TemporalType.DATE)
    private Date bookedAt;

    @ManyToOne
    @JoinColumn
    private ShowEntity show;

    @ManyToOne
    @JoinColumn
    private UserEntity user;

    @OneToMany(mappedBy = "ticket", cascade = CascadeType.ALL)
    List<ShowSeatsEntity> listOfBookedSeat;

    public TicketEntity() {
    }
}
