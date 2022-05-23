package entities;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Reservation {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long code ;
    @ManyToOne
    private Customer customer;
    @OneToMany(mappedBy = "reservation")
    private List<ReservationDetails> details;
}
