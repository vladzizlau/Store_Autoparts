package by.pvt.core.domain.shopDomain;

import by.pvt.core.domain.User;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(schema = "parts", name = "car")
public class Car {
    @Id
    @GeneratedValue (strategy = GenerationType.SEQUENCE)
    private Long id;
    private String brand;



}
