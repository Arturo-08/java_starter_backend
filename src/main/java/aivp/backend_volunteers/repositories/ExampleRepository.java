package aivp.backend_volunteers.repositories;

import aivp.backend_volunteers.entities.ExampleEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExampleRepository extends JpaRepository<ExampleEntity,Integer> {
}
