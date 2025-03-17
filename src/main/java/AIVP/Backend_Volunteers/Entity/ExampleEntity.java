package AIVP.Backend_Volunteers.Entity;

import jakarta.persistence.*;
import lombok.Data;


@Entity
@Table(name = "Example")
@Data
public class ExampleEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Integer id;
    private String name;
}
