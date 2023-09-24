package by.pvt.api.dto.carDTO;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class EngineResponse {
    long id;
    String name;
    String type;
    double engine_capacity;
    int count;
    double cost;

}
