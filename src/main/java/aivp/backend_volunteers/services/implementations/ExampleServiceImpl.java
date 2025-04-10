package aivp.backend_volunteers.services.implementations;

import aivp.backend_volunteers.entities.ExampleEntity;
import aivp.backend_volunteers.models.examples.ExampleResponseDto;
import aivp.backend_volunteers.models.exceptions.DatabaseException;
import aivp.backend_volunteers.repositories.ExampleRepository;
import aivp.backend_volunteers.services.interfaces.ExampleService;
import aivp.backend_volunteers.utils.Constants;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class ExampleServiceImpl implements ExampleService {

    private final ExampleRepository repository;
    private final ModelMapper mapper;

    @Override
    public List<ExampleResponseDto> findAll() {
        try {
            List<ExampleEntity> listExample = repository.findAll();
            return listExample.stream()
                    .map(exa -> mapper.map(exa, ExampleResponseDto.class))
                    .collect(Collectors.toList());
        } catch (Exception e) {
            throw new DatabaseException(Constants.MESSAGE_INTERNAL_DATABASE_ERROR.concat(e.getMessage()), e);
        }
    }
}
