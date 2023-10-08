package by.pvt.api.dto.carDTO;

import lombok.Builder;
import lombok.Data;

import javax.persistence.Table;

@Data
@Builder
public class CarModelResponse {
    private long id;
    private String model;
    private int year;
}
