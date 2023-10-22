package by.pvt.core.domain;

import lombok.*;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Data
@Builder
@Entity
@Table(schema = "parts", name = "order")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Double cost;


    @OneToMany(mappedBy = "order")
    private List<Shopcart> shopcart;

    @ManyToOne(fetch = FetchType.LAZY)
    @EqualsAndHashCode.Exclude
    @JoinColumn(name = "user_id")
    private User user;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return Objects.equals(id, order.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
