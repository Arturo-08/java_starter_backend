package aivp.backend_volunteers.models.auth;

import lombok.Data;

@Data
public class AuthRequestDto {
    private String email;
    private String password;
}
