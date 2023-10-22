package by.pvt.core.domain.shopDomain;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Objects;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(schema = "parts", name = "engine")
public class Engine {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private EngineType type; //бензин или дизель
    private Double engineCapacity;
    private Integer count;
    private BigDecimal cost;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Engine engine = (Engine) o;
        return Objects.equals(id, engine.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
