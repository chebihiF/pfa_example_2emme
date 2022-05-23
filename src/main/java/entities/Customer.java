package entities;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity @Getter @Setter @AllArgsConstructor @NoArgsConstructor @ToString
@Table(name = "client")
public class Customer {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true)
    private String cin;
    @Column(unique = true, name = "num_passport")
    private String passport_code;
    private String phone_number;
    @Column(name = "pays")
    private String country;
    @OneToMany(mappedBy = "customer")
    private List<Reservation> reservation;
}
