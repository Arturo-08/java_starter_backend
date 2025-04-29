package aivp.backend_volunteers.controllers;

import aivp.backend_volunteers.entities.UserEntity;
import aivp.backend_volunteers.models.HttpResponse;
import aivp.backend_volunteers.models.exceptions.ApiException;
import aivp.backend_volunteers.models.users.UserResponseDto;
import aivp.backend_volunteers.services.interfaces.UserService;
import aivp.backend_volunteers.utils.Constants;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.swing.text.html.Option;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

import static aivp.backend_volunteers.utils.Constants.*;

@RestController
@RequestMapping("/user")
@AllArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping("/list-all")
    public ResponseEntity<HttpResponse<List<UserResponseDto>>> getAllUsers(){
        List<UserResponseDto> users = userService.findAll().stream().map(userService::transformResponse).toList();
        return ResponseEntity.ok(new HttpResponse<>(STATUS_OK,users,MESSAGE_OK));
    }
    @GetMapping("/{email}")
    public ResponseEntity<HttpResponse<UserResponseDto>> getUserByEmail(@PathVariable("email") String email){
        Optional<UserEntity> user = userService.findByEmail(email);

        if (user.isEmpty()) {
            throw new ApiException(Constants.STATUS_NOT_FOUND, USER_NOT_FOUND_BY_EMAIL + email);
        }

        UserResponseDto userDto = userService.transformResponse(user.get());
        return ResponseEntity.ok(new HttpResponse<>(STATUS_OK,userDto,MESSAGE_OK));
    }
}
