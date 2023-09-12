package by.pvt.core.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(schema = "autopart", name = "user")
public class User {
    @Id
    long id;
    String firstName;
    String surName;
    Integer age;
    String phoneNumber;
    LocalDate lastVisitDate;
    @Column (name = "amount_sum")
    double amountSum;
}
