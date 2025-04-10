package aivp.backend_volunteers.entities;

import jakarta.persistence.*;
import lombok.Data;
import java.util.List;

@Entity
@Table(name = "Job")
@Data
public class JobEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToMany(mappedBy = "jobEntity", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<ExampleEntity> examples;
}
