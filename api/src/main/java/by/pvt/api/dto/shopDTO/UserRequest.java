package by.pvt.api.dto.shopDTO;


import lombok.Data;
import lombok.Setter;


import java.time.LocalDate;
@Data

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
