package AIVP.Backend_Volunteers.Services;

import AIVP.Backend_Volunteers.Services.Dtos.ResponseDto.ExampleResponseDto;

import java.util.List;

public interface IExampleService {
    List<ExampleResponseDto> findAll();
}
