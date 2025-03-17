package AIVP.Backend_Volunteers.Controllers;

import AIVP.Backend_Volunteers.Services.Dtos.ResponseDto.ExampleResponseDto;
import AIVP.Backend_Volunteers.Services.IExampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/Example")
public class ExampleController {
    @Autowired
    private IExampleService service;
    @GetMapping
    public ResponseEntity<List<ExampleResponseDto>> getAllExamples(){
        return ResponseEntity.ok(service.findAll());
    }

}
