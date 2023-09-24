package by.pvt.core.domain.shopDomain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(schema = "parts", name = "akb")
public class AKB
    {
    @Id
    long id;
    String manufacturer; //производитель
    String name;
    int voltage; //12v или 24v
    double battery_capacity; // емкость
    int electric_current; //Электрический ток, Ампер
    int length;
    int width;
    int height;
    double price;

    }
