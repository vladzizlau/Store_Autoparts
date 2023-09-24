package by.pvt.api.dto.carDTO;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class BodypartResponse {
    long id;
    String name;
    String carBrand;
    String carModel;
    int count;
    double cost;
}
