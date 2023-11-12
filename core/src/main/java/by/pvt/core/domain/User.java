package by.pvt.core.domain;

import by.pvt.core.domain.shopDomain.Car;
import lombok.*;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

@Getter
@Setter
@Table(schema = "parts", name = "user")
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
    private List<Comments> comments;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(id, user.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
