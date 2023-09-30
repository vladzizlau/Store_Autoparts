package by.pvt.core.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

//Корзина
@Data
@Builder
@Entity
@Table(schema = "parts", name = "shopcart")
public class Shopcart {
    @Id
    @GeneratedValue
    private Long id;
    private Long orderid;
    private String status;
    private Double cost;

    @OneToMany(mappedBy = "shopcart")
    private List<Order> order;
}
