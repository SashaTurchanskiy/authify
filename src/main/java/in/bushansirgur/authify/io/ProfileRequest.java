package in.bushansirgur.authify.io;


import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProfileRequest {

    @NotBlank(message = "Name should be not empty")
    private String name;
    @Email(message = "Email should be valid")
    @NotNull(message = "Email should not be empty")
    private String email;
    @Size(min = 8, message = "Password should be at least 8 characters long")
    private String password;
}
