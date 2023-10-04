package by.pvt.core.domain.shopDomain;

import lombok.*;

import javax.persistence.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(schema = "parts", name = "model")
public class CarModel {

    @Id
    @GeneratedValue
    private Long id;
    private String model;
    private int year;

    @ManyToOne(fetch = FetchType.LAZY)
    @EqualsAndHashCode.Exclude
    @JoinColumn(name = "car_id")
    private Car car;


}
