package Models;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="theater")
public class Theater {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private String location;

//    keep
    @OneToMany(mappedBy = "theater", cascade = CascadeType.ALL)
    private List<TheaterSeats > theaterSeatsList= new ArrayList<>();
}
