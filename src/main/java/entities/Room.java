package entities;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Entity @Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Table(name = "Chambre")
public class Room {
    @Id
    private Long num ;
    private String type ;
    private double price ;
    @OneToMany(mappedBy = "room")
    private List<ReservationDetails> details;
}
