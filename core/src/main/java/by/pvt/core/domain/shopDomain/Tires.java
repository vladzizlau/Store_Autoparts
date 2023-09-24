package by.pvt.core.domain.shopDomain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

//Автошины
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(schema = "parts", name = "tires")
public class Tires
    {
    @Id
    long id;
    String manufacturer;
    String name;
    double profile_width;
    double profile_height;
    int diametr;
    String season;
    double price;
    }
