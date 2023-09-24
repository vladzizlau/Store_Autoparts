package by.pvt.api.dto.shopDTO;


import lombok.Data;
import lombok.Setter;


import java.time.LocalDate;
@Data

public class UserRequest {
    long id;
    String firstName;
    String surName;
    @Setter
    String password;
    Integer age;
    String phoneNumber;
    String email;
    LocalDate lastVisitDate;
    double amountSum;


}
