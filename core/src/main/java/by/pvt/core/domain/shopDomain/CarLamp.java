package by.pvt.core.domain.shopDomain;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;

@Data
@Builder
@Entity
@Table(schema = "parts", name = "carlamp")
public class CarLamp {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String model;
    private String socket;
    private Integer power;
    private Integer count;
    private BigDecimal cost;

}
