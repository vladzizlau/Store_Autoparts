package by.pvt.api.dto.carDTO;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Data

public class CarLampRequest {
    private Long id;
    private String name;
    private String model;
    private String socket;
    private Integer power;
    private Integer count;
    private BigDecimal cost;


}
