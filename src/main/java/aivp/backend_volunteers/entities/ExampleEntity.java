package aivp.backend_volunteers.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Example")
@Data
public class ExampleEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String product;

    @ManyToOne
    @JoinColumn(name = "job_id", nullable = false)
    private JobEntity jobEntity;
}
