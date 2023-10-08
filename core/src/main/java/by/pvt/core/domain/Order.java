package by.pvt.core.domain;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Data
@Builder
@Entity
@Table(schema = "parts", name = "order")
public class Order {
    @Id
    @GeneratedValue
    private Long id;
    private Double cost;


    @OneToMany(mappedBy = "order")
    private List<Shopcart> shopcart;

    @ManyToOne(fetch = FetchType.LAZY)
    @EqualsAndHashCode.Exclude
    @JoinColumn(name = "user_id")
    private User user;


}
