package by.pvt.api.dto.carDTO;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CarLampResponse {
    long id;
    String name;
    String model;
    String socket;
    String power;
    int count;
    double cost;


}
