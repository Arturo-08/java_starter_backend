package aivp.backend_volunteers.controllers;

import aivp.backend_volunteers.models.HttpResponse;
import aivp.backend_volunteers.models.examples.ExampleResponseDto;
import aivp.backend_volunteers.services.interfaces.ExampleService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static aivp.backend_volunteers.utils.Constants.*;

@RestController
@RequestMapping("/Example")
@AllArgsConstructor
public class ExampleController {

    private final ExampleService service;

    @GetMapping
    public ResponseEntity<HttpResponse<List<ExampleResponseDto>>> getAllExamples(){
            return ResponseEntity.ok(new HttpResponse<>(STATUS_OK,service.findAll(),MESSAGE_OK));
    }

}
