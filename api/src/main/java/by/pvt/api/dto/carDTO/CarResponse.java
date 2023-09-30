package by.pvt.api.dto.carDTO;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CarResponse {
    long id;
    String car_brand;
    String car_model;
    int year;


}
