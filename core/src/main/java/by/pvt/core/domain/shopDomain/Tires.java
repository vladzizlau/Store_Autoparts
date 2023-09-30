package by.pvt.core.domain.shopDomain;

import lombok.*;

import javax.persistence.*;

//Автошины
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(schema = "parts", name = "tires")
public class Tires {
    @Id
    private Long id;
    private String manufacturer;
    private String name;
    private Double profile_width;
    private Double profile_height;
    private Integer diametr;
    private String season;
    private Double price;

    @ManyToOne(fetch = FetchType.LAZY)
    @EqualsAndHashCode.Exclude
    @JoinColumn(name = "manufacturer_id")
    private ManufacturerTires manufacturerTires;
}
