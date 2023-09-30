package by.pvt.core.domain;

import by.pvt.core.domain.shopDomain.Car;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Data
@Builder
@Entity
@Table(schema = "parts", name = "user")
public class User {
    @Id
    private Long id;
    private String firstName;
    private String surName;
    private String password;
    private Integer age;
    private String phoneNumber;
    private String email;
    private LocalDate lastVisitDate;

    @Column (name = "amount_sum")
    private double amountSum;

    @OneToMany (mappedBy = "user")
    private List<Order> order;

    @OneToMany (mappedBy = "user")
    private List<Car> car;
}
