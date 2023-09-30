package by.pvt.api.dto.carDTO;

import lombok.Builder;
import lombok.Data;

@Data

public class CarRequest {
    long id;
    String car_brand;
    String car_model;
    int year;


}
