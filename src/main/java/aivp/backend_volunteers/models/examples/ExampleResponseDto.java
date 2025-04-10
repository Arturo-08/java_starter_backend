package aivp.backend_volunteers.models.examples;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ExampleResponseDto  {
     private  Integer id;
     private  String name;

    public ExampleResponseDto(Integer id, String name) {
        this.id = id;
        this.name = name;

    }
    public ExampleResponseDto() {

    }
}
