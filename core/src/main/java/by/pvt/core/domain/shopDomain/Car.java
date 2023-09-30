package by.pvt.core.domain.shopDomain;

import by.pvt.core.domain.User;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@Data
@Builder
@Entity
@Table(schema = "parts", name = "car")
public class Car {
    @Id
    @GeneratedValue
    private Long id;
    private String car_brand;
    private String car_model;
    private Integer year;

    @OneToMany (mappedBy = "car")
    private List<BodyPart> bodyPart;

    @OneToMany (mappedBy = "car")
    private List<CarLamps> carLamps;

    @OneToMany (mappedBy = "car")
    private List<Engine> engine;

    @ManyToOne(fetch = FetchType.LAZY)
    @EqualsAndHashCode.Exclude
    @JoinColumn(name = "user_id")
    private User user;
}
