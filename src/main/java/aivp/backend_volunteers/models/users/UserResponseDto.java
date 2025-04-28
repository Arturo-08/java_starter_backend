package aivp.backend_volunteers.models.users;


import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Builder
public class UserResponseDto {

    private String email;

    private String fullName;

    private Boolean enabled;

    private String role;
}
