package by.pvt.api.dto.carDTO;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Builder
public class BodypartResponse {
    private Long id;
    private String name;
    private String carBrand;
    private Integer count;
    private BigDecimal cost;
}
