package by.pvt.api.dto.carDTO;


import lombok.Data;

import java.math.BigDecimal;

@Data

public class EngineRequest {
    private long id;
    private String name;
    private String type;
    private double engineCapacity;
    private int count;
    private BigDecimal cost;


}
