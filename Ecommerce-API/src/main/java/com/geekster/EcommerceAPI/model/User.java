package com.geekster.EcommerceAPI.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Value;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer userId;

    @NotBlank
    private String userName;

    @NotBlank
    @Email
    private String userEmail;

    @Size(min = 8, max = 20, message = "Password length must be between 8 and 20 characters")
    @Pattern(regexp = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=!]).*$", message = "Password must contain at least one digit, one lowercase, one uppercase letter and one special character")
    private String userPassword;

    @Size(max=12, min =10)
    @Digits(integer = 12, fraction = 0)
    private String userPhoneNumber;
}
