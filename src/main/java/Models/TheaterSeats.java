package Models;

import jakarta.persistence.*;

@Entity
@Table(name="theater seats")
public class TheaterSeats {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer id;
}
