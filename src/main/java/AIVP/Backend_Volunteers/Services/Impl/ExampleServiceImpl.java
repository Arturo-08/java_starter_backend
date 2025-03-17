package AIVP.Backend_Volunteers.Services.Impl;
import AIVP.Backend_Volunteers.Entity.ExampleEntity;
import AIVP.Backend_Volunteers.Repository.ExampleRepository;
import AIVP.Backend_Volunteers.Services.Dtos.ResponseDto.ExampleResponseDto;
import AIVP.Backend_Volunteers.Services.IExampleService;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class ExampleServiceImpl implements IExampleService {
    @Autowired
    private ExampleRepository repository;
    @Autowired
    private  ModelMapper mapper;
    @Override
    public List<ExampleResponseDto> findAll() {
        List<ExampleEntity> listExample = repository.findAll();
        return listExample.stream()
                .map(exa -> mapper.map(exa, ExampleResponseDto.class))
                .collect(Collectors.toList());
    }
}
