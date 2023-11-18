package by.pvt.api.dto.shopDTO;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;

//import jakarta.persistence.Column;
import java.time.LocalDate;
@Data
@Builder
public class UserResponse {

    private Long id;
    private String firstName;
    private String surName;
    private Integer age;
    private String password;
    private String phoneNumber;
    private String email;
    private LocalDate lastVisitDate;
    private Double amountSum;
    private String role;
}
