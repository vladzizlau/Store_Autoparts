package by.pvt.api.dto.carDTO;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Builder
public class EngineResponse {
    private long id;
    private String name;
    private String type;
    private double engineCapacity;
    private int count;
    private BigDecimal cost;

}
