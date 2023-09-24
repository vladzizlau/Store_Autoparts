package by.pvt.core.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(schema = "parts", name = "user")
public class User {
    @Id
    long id;
    String firstName;
    String surName;
    String password;
    Integer age;
    String phoneNumber;
    String email;
    LocalDate lastVisitDate;
    @Column (name = "amount_sum")
    double amountSum;
}
