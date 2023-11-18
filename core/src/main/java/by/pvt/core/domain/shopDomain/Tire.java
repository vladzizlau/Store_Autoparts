package by.pvt.core.domain.shopDomain;

import lombok.*;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.util.Objects;

//Автошины
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(schema = "parts", name = "tires")
public class Tire {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long code;
    private String name;
    private Double profile_width;
    private Double profile_height;
    private Integer diametr;
    private TireType season;
    private BigDecimal price;

    @ManyToOne(fetch = FetchType.LAZY)
    @EqualsAndHashCode.Exclude
    @JoinColumn(name = "manufacturer_id")
    private ManufacturerTires manufacturerTires;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tire tire = (Tire) o;
        return Objects.equals(id, tire.id);
    }


}
