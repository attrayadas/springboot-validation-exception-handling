package com.attraya.dto;

import com.attraya.validation.ValidateGender;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor(staticName = "build")
@NoArgsConstructor
public class UserRequest {
    @NotNull(message = "username shouldn't be null")
    private String name;
    @Email(message = "invalid email address")
    private String email;
    @Pattern(regexp = "^\\d{10}$", message = "invalid mobile number")
    private String mobile;

    // custom annotation
    @ValidateGender
    private String gender; // Male or Female
    @Min(18)
    @Max(60)
    private int age;
    @NotBlank
    private String nationality;
}
