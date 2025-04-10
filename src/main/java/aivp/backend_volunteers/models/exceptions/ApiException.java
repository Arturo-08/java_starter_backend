package aivp.backend_volunteers.models.exceptions;

import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
public class ApiException extends RuntimeException {
    private final int statusCode;

    public ApiException(int statusCode, String message) {
        super(message);
        this.statusCode = statusCode;
    }

    public ApiException(HttpStatus status, String message) {
        super(message);
        this.statusCode = status.value();
    }
}
