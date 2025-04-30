package aivp.backend_volunteers.models.auth;


import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class AuthResponseDto {
    private String token;
}
