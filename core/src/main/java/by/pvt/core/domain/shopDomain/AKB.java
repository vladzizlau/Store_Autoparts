package by.pvt.core.domain.shopDomain;

import by.pvt.core.domain.Shopcart;
import lombok.*;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.util.Objects;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(schema = "parts", name = "akb")
public class AKB {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Integer voltage; //12v или 24v
    private Double batteryCapacity; // емкость
    private Integer electric_current; //Электрический ток, Ампер
    private Integer length;
    private Integer width;
    private Integer height;
    private BigDecimal price;


    @ManyToOne(fetch = FetchType.LAZY)
    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    @JoinColumn(name = "manufacturer_id")
    private ManufacturerAKB manufacturerAKB; //производитель

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AKB akb = (AKB) o;
        return Objects.equals(id, akb.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
