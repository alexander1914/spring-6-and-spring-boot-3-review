package github.alexander1914.springjpa.restfull.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Schema(
        description = "UserDTO Model information"
)
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO {

/// @NotEmpty: is an annotation that a field is not null and also not empty, meaning
/// it must contain at least one element (for collections) or at least one character (for strings).
///@Email: is annotation that Email can be validated with this.

    private Long id;

    @Schema(
            description = "User First Name"
    )
    @NotEmpty(message = "User first name should not be null or empty")
    private String firstName;

    @Schema(
            description = "User Last Name"
    )
    @NotEmpty(message = "User last name name should not be null or empty")
    private String lastName;

    @Schema(
            description = "User Email Address"
    )
    @NotEmpty(message = "User email should not be null or empty")
    @Email(message = "Email address should be valid")
    private String email;
}
