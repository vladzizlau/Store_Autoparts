package by.pvt.core.domain.shopDomain;

import lombok.*;

import javax.persistence.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(schema = "parts", name = "bodypart")
public class BodyPart {
    @Id
    private Long id;
    private String name;
    private String carBrand;
    private String carModel;
    private Integer count;
    private Double cost;

    @ManyToOne(fetch = FetchType.LAZY)
    @EqualsAndHashCode.Exclude
    @JoinColumn(name = "car_id")
    private Car car;
}
