package by.pvt.core.domain.shopDomain;

import lombok.*;

import javax.persistence.*;

@Data
@Builder
@Entity
@Table(schema = "parts", name = "akb")
public class AKB {
    @Id
    @GeneratedValue
    private Long id;
    private String manufacturer; //производитель
    private String name;
    private Integer voltage; //12v или 24v
    private Double battery_capacity; // емкость
    private Integer electric_current; //Электрический ток, Ампер
    private Integer length;
    private Integer width;
    private Integer height;
    private Double price;


    @ManyToOne(fetch = FetchType.LAZY)
    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    @JoinColumn(name = "manufacturer_id")
    private ManufacturerAKB manufacturerAKB;
}
