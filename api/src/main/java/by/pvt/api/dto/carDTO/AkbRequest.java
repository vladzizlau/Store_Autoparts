package by.pvt.api.dto.carDTO;

import lombok.Data;

@Data
public class AkbRequest {
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
