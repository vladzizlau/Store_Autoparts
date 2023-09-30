package by.pvt.core.domain.shopDomain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(schema = "parts", name = "manufacturer_tires")
public class ManufacturerTires {
    @Id
    private Long id;
    private String name;


    @OneToMany(mappedBy = "manufacturerTires")
    private List<Tires> tires;

}
