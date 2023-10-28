package by.pvt.core.domain;

import by.pvt.core.domain.shopDomain.AKB;
import by.pvt.core.domain.shopDomain.BodyPart;
import by.pvt.core.domain.shopDomain.CarLamp;
import by.pvt.core.domain.shopDomain.Tire;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.util.Objects;

//Корзина
@Data
@Builder
@Entity
@Table(schema = "parts", name = "shopcart")
public class Shopcart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String status;
    private BigDecimal cost;
    private Integer count;


    @ManyToOne(fetch = FetchType.LAZY)
    @EqualsAndHashCode.Exclude
    @JoinColumn(name = "order_id")
    private Order order;

    @OneToOne (fetch = FetchType.LAZY)
    @EqualsAndHashCode.Exclude
    @JoinColumn(name = "akb_id")
    private AKB akb;

    @OneToOne (fetch = FetchType.LAZY)
    @EqualsAndHashCode.Exclude
    @JoinColumn(name = "bodypart_id")
    private BodyPart bodyPart;

    @OneToOne (fetch = FetchType.LAZY)
    @EqualsAndHashCode.Exclude
    @JoinColumn(name = "carLamp_id")
    private CarLamp carLamp;

    @OneToOne (fetch = FetchType.LAZY)
    @EqualsAndHashCode.Exclude
    @JoinColumn(name = "tire_id")
    private Tire tire;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Shopcart shopcart = (Shopcart) o;
        return Objects.equals(id, shopcart.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
