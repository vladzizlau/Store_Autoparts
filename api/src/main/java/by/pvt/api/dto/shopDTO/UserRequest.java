package by.pvt.api.dto.shopDTO;



import lombok.Data;



import java.time.LocalDate;
@Data
public class UserRequest {
    private String firstName;
    private String surName;
    private String password;
    private Integer age;
    private String phoneNumber;
    private String email;
    private LocalDate lastVisitDate;
    private Double amountSum;


}
