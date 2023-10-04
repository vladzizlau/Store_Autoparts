package by.pvt.core.domain.shopDomain;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;

//Автошины
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(schema = "parts", name = "tires")
public class Tire {
    @Id
    private Long id;
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
}
