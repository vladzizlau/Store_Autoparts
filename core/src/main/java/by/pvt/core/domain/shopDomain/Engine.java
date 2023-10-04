package by.pvt.core.domain.shopDomain;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(schema = "parts", name = "engine")
public class Engine {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String name;
    private EngineType type; //бензин или дизель
    private Double engineCapacity;
    private Integer count;
    private BigDecimal cost;


}
