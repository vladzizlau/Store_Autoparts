package by.pvt.core.domain.shopDomain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.persistence.*;
import java.util.List;
import java.util.Objects;

@Data
@Entity
@Table(schema = "parts", name = "manufacturer_akb")
public class ManufacturerAKB {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;


    @OneToMany(mappedBy = "manufacturerAKB")
    private List<AKB> akb;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ManufacturerAKB that = (ManufacturerAKB) o;
        return Objects.equals(id, that.id);
    }

}
