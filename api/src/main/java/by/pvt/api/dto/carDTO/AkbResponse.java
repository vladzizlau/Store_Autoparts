package by.pvt.api.dto.carDTO;


import lombok.Builder;
import lombok.Data;


@Data
@Builder

public class AkbResponse {
    long id;
    String manufacturer;
    String name;
    int voltage;
    double battery_capacity;
    int electric_current;
    int length;
    int width;
    int height;
    double price;

}
