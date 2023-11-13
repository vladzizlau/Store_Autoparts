package by.pvt.api.dto.carDTO;


import lombok.Data;

import java.math.BigDecimal;

@Data

public class EngineRequest {
    private Long id;
    private String name;
    private String type;
    private Double engineCapacity;
    private Integer count;
    private BigDecimal cost;


}
