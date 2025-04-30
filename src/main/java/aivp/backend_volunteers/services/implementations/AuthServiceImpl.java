package aivp.backend_volunteers.services.implementations;

import aivp.backend_volunteers.config.security.jwt.JwtUtils;
import aivp.backend_volunteers.models.auth.AuthRequestDto;
import aivp.backend_volunteers.models.auth.AuthResponseDto;
import aivp.backend_volunteers.services.interfaces.AuthService;
import lombok.AllArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class AuthServiceImpl implements AuthService {

    private final AuthenticationManager authenticationManager;
    private final JwtUtils jwtUtils;

    @Override
    public AuthResponseDto authenticate(AuthRequestDto request) {
        Authentication authentication = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(
                        request.getEmail(),
                        request.getPassword()
                )
        );

        UserDetails userDetails = (UserDetails) authentication.getPrincipal();
        String jwt = jwtUtils.generateToken(userDetails);

        return AuthResponseDto.builder().token(jwt).build();
    }
}
