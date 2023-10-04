package by.pvt.api.dto.carDTO;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Builder
public class CarLampResponse {
    private long id;
    private String name;
    private String model;
    private String socket;
    private Integer power;
    private int count;
    private BigDecimal cost;


}
