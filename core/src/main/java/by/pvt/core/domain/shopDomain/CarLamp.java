package by.pvt.core.domain.shopDomain;

import lombok.*;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.util.Objects;

@Data
@Entity
@Table(schema = "parts", name = "carlamp")
public class CarLamp {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String model;
    private String socket;
    private Integer power;
    private Integer count;
    private BigDecimal cost;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CarLamp carLamp = (CarLamp) o;
        return Objects.equals(id, carLamp.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
