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
@Entity
@Table(schema = "parts", name = "shopcart")
public class Shopcart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private BigDecimal cost;
    private Integer count;
    private Long product;



    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "order_id")
    private Order order;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Shopcart shopcart = (Shopcart) o;
        return Objects.equals(id, shopcart.id);
    }

}
