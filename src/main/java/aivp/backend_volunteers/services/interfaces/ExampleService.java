package aivp.backend_volunteers.services.interfaces;

import aivp.backend_volunteers.models.examples.ExampleResponseDto;

import java.util.List;

public interface ExampleService {
    List<ExampleResponseDto> findAll();
}
