package by.pvt.core.domain.shopDomain;

import by.pvt.core.domain.Order;
import lombok.*;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.util.List;
import java.util.Objects;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(schema = "parts", name = "bodypart")
public class BodyPart {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    private Long code;
    private String name;
    private Integer count;
    private BigDecimal cost;

    @ManyToOne(fetch = FetchType.LAZY)
    @EqualsAndHashCode.Exclude
    @JoinColumn(name = "model_id")
    private CarModel carModel;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BodyPart bodyPart = (BodyPart) o;
        return Objects.equals(id, bodyPart.id);
    }

}
