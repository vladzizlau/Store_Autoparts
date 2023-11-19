package by.pvt.api.dto.carDTO;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class AkbRequest {
    @NotNull
    @Positive
    @Size(min = 5, max = 10)
    private Long code;
    @NotEmpty
    private String manufacturer;
    @NotEmpty
    private String name;
    @NotNull
    @Positive
    private Integer voltage;
    @NotNull
    @Positive
    private Double batteryCapacity;
    @NotNull
    @Positive
    private Integer electricCurrent;
    @NotNull
    @Positive
    private Integer length;
    @NotNull
    @Positive
    private Integer width;
    @NotNull
    @Positive
    private Integer height;
    @NotNull
    @Positive
    private BigDecimal price;

}
