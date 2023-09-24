package by.pvt.api.dto.carDTO;


import lombok.Data;

@Data

public class EngineRequest {
    long id;
    String name;
    String type;
    double engine_capacity;
    int count;
    double cost;


}
