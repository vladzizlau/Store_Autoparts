package by.pvt.api.dto.shopDTO;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;

import javax.persistence.Column;
import java.time.LocalDate;
@Data
@Builder
public class UserResponse {

    long id;

    String firstName;

    String surName;

    Integer age;

    String phoneNumber;

    String email;

    LocalDate lastVisitDate;

    double amountSum;
}
