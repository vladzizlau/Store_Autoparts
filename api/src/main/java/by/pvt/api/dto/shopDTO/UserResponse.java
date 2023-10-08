package by.pvt.api.dto.shopDTO;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;

import javax.persistence.Column;
import java.time.LocalDate;
@Data
@Builder
public class UserResponse {

    private long id;

    private String firstName;

    private String surName;

    private Integer age;

    private String phoneNumber;

    private String email;

    private LocalDate lastVisitDate;

    private double amountSum;
}
