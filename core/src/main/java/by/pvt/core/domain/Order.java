package by.pvt.core.domain;

import lombok.*;

import javax.persistence.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(schema = "parts", name = "order")
public class Order {
    @Id
    @GeneratedValue
    private Long id;
    private Long productid;
    private Long userid;
    private Double cost;
    private Integer count;

    @ManyToOne(fetch = FetchType.LAZY)
    @EqualsAndHashCode.Exclude
    @JoinColumn(name = "shopcart_id")
    private Shopcart shopcart;

    @ManyToOne(fetch = FetchType.LAZY)
    @EqualsAndHashCode.Exclude
    @JoinColumn(name = "user_id")
    private User user;


}
