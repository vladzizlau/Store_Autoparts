package by.pvt.core.domain.shopDomain;

import by.pvt.core.domain.Shopcart;
import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(schema = "parts", name = "akb")
public class AKB {
    @Id
    @GeneratedValue (strategy = GenerationType.SEQUENCE)
    private Long id;
    private String name;
    private Integer voltage; //12v или 24v
    private Double battery_capacity; // емкость
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


}
