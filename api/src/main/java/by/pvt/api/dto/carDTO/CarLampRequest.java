package by.pvt.api.dto.carDTO;

import lombok.Builder;
import lombok.Data;

@Data

public class CarLampRequest {
    long id;
    String name;
    String model;
    String socket;
    String power;
    int count;
    double cost;


}
