package aivp.backend_volunteers.models.exceptions;

import aivp.backend_volunteers.models.HttpResponse;
import aivp.backend_volunteers.utils.Constants;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.Instant;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(ApiException.class)
    public ResponseEntity<HttpResponse<String>> handleApiException(ApiException ex) {
        HttpResponse<String> response = new HttpResponse<>(
                Instant.now(),
                ex.getStatusCode(),
                ex.getMessage(),
                null
        );
        return ResponseEntity.status(ex.getStatusCode()).body(response);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<HttpResponse<String>> handleGenericException(Exception ex) {
        HttpResponse<String> response = new HttpResponse<>(
                Instant.now(),
                Constants.STATUS_INTERNAL_SERVER_ERROR,
                Constants.MESSAGE_INTERNAL_SERVER_ERROR,
                null
        );
        return ResponseEntity.status(response.getStatus()).body(response);
    }

    @ExceptionHandler(DatabaseException.class)
    public ResponseEntity<HttpResponse<String>> handleDatabaseException(DatabaseException ex) {
        HttpResponse<String> response = new HttpResponse<>(
                Instant.now(),
                Constants.STATUS_INTERNAL_SERVER_ERROR,
                ex.getMessage(),
                null
        );
        return ResponseEntity.status(response.getStatus()).body(response);
    }
}
