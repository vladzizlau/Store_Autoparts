package by.pvt.api.dto.carDTO;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Data

public class CarLampRequest {
    @NotNull
    @Positive
    @Size(min =5, max = 10)
    private Long code;
    @NotEmpty
    private String name;
    @NotEmpty
    private String model;
    @NotEmpty
    private String socket;
    @NotNull
    @Positive
    private Integer power;
    @NotNull
    @Positive
    private Integer count;
    @NotNull
    @Positive
    private BigDecimal cost;


}
