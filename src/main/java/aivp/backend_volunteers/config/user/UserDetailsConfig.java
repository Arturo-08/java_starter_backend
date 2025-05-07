package aivp.backend_volunteers.config.user;

import aivp.backend_volunteers.services.interfaces.UserService;
import aivp.backend_volunteers.utils.Constants;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

@Configuration
public class UserDetailsConfig {
    @Bean
    public UserDetailsService userDetailsService(UserService userService) {
        return username -> userService.findByEmail(username)
                .orElseThrow(() -> new UsernameNotFoundException(Constants.USER_NOT_FOUND));
    }
}
