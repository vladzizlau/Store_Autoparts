package by.pvt.api.dto.carDTO;


import jakarta.validation.constraints.*;
import lombok.Data;

import java.math.BigDecimal;

@Data

public class EngineRequest {
    @NotNull
    @Positive
    @Size(min = 5,max = 10)
    private Long code;
    @NotBlank
    private String name;
    @NotBlank
    private String type;
    @NotEmpty
    @Positive
    private Double engineCapacity;
    @NotEmpty
    @Positive
    private Integer count;
    @NotEmpty
    @Positive
    private BigDecimal cost;
}
