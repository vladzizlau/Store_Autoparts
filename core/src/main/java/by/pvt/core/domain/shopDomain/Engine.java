package by.pvt.core.domain.shopDomain;

import lombok.*;

import javax.persistence.*;

@Data
@Builder
@Entity
@Table(schema = "parts", name = "engine")
public class Engine {
    @Id
    private Long id;
    private String name;
    private String type; //бензин или дизель
    private Double engine_capacity;
    private Integer count;
    private Double cost;

    @ManyToOne(fetch = FetchType.LAZY)
    @EqualsAndHashCode.Exclude
    @JoinColumn(name = "car_id")
    private Car car;
}
