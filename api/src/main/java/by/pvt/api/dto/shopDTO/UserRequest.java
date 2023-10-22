package by.pvt.api.dto.shopDTO;


import lombok.Builder;
import lombok.Data;
import lombok.Setter;


import java.time.LocalDate;
@Data
@Builder
public class UserRequest {
    private long id;
    private String firstName;
    private String surName;
    @Setter
    private String password;
    private Integer age;
    private String phoneNumber;
    private String email;
    private LocalDate lastVisitDate;
    private double amountSum;


}
