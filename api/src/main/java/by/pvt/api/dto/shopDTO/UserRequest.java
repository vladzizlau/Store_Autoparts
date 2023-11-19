package by.pvt.api.dto.shopDTO;



import jakarta.validation.constraints.*;
import lombok.Data;
import org.hibernate.validator.constraints.Length;


import java.time.LocalDate;
@Data
public class UserRequest {
    @NotBlank(message = "Не правильно введено имя пользователя")
    @Size(min = 3, max = 25)
    private String firstName;
    @NotBlank(message = "Не правильно введена фамилия")
    private String surName;
    @NotBlank(message = "Пароль не соответствует длине (от 6 до 30 символов)")
    @Size(min = 6, max = 30)
    private String password;
    @NotNull
    @Positive
    private Integer age;
    @NotBlank
    @Size(min=8, max = 12)
    private String phoneNumber;
    @NotBlank
    @Email(message = "Не правильно введено поле email")
    private String email;
    @NotNull
    @Positive
    private Double amountSum;

}
