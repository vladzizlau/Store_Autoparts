package by.pvt.core.domain.shopDomain;

import lombok.*;

import javax.persistence.*;

@Data
@Builder
@Entity
@Table(schema = "parts", name = "carlamp")
public class CarLamps {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String model;
    private String socket;
    private String power;
    private Integer count;
    private Double cost;

    @ManyToOne(fetch = FetchType.LAZY)
    @EqualsAndHashCode.Exclude
    @JoinColumn(name = "car_id")
    private Car car;
}
