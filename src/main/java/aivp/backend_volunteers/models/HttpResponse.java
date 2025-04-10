package aivp.backend_volunteers.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;
import java.time.Instant;

@Getter
@AllArgsConstructor
@ToString
@JsonInclude(JsonInclude.Include.NON_NULL)
public class HttpResponse<T> {
    private Instant timestamp;
    private int status;
    private String message;
    private T data;

    public HttpResponse(int status, T data, String message) {
        this.timestamp = Instant.now();
        this.status = status;
        this.data = data;
        this.message = message;
    }
}
