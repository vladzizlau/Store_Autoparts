package by.pvt.core.domain;

import by.pvt.core.domain.shopDomain.Car;
import by.pvt.core.domain.shopDomain.CarModel;
import lombok.*;

import jakarta.persistence.*;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Collection;
import java.util.List;
import java.util.Objects;

@Data
@Table(schema = "parts", name = "user")
@Entity
public class User  implements UserDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String surName;
    private String pass;
    private Integer age;
    private String phoneNumber;
    private String email;
    private LocalDate lastVisitDate;
    private String role;


    @Column (name = "amount_sum")
    private double amountSum;

    @OneToMany (mappedBy = "user")
    private List<Order> order;

    @OneToMany (mappedBy = "user")
    private List<Comments> comments;

    @ManyToOne(fetch = FetchType.LAZY)
    @EqualsAndHashCode.Exclude
    @JoinColumn(name = "model_car")
    private CarModel carModel;



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(id, user.id);
    }


    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return List.of(new SimpleGrantedAuthority(this.role));
    }

    @Override
    public String getPassword() {
        return pass;
    }

    @Override
    public String getUsername() {
       return email;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
