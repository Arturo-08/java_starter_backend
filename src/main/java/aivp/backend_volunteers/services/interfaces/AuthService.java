package aivp.backend_volunteers.services.interfaces;

import aivp.backend_volunteers.models.auth.AuthRequestDto;
import aivp.backend_volunteers.models.auth.AuthResponseDto;

public interface AuthService {
    AuthResponseDto authenticate(AuthRequestDto request);
}
