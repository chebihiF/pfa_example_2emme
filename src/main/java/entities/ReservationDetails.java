package entities;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Table(name = "DetailsReservation")
public class ReservationDetails {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ;
    @ManyToOne
    private Reservation reservation;
    @ManyToOne
    private Room room;
    private LocalDate start_date;
    private LocalDate end_date ;
    private double price;
}
