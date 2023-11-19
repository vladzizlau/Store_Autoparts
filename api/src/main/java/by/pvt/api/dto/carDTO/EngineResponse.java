package by.pvt.api.dto.carDTO;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Builder
public class EngineResponse {
    private Long id;
    private Long code;
    private String name;
    private String type;
    private Double engineCapacity;
    private Integer count;
    private BigDecimal cost;
    private Long model_id;

}
