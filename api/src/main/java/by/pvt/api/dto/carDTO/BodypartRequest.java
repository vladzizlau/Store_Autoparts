package by.pvt.api.dto.carDTO;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;


import java.beans.Transient;
import java.math.BigDecimal;

@Data
public class BodypartRequest {
    @NotNull
    @Positive
    @Size(min = 5, max = 10)
    private Long code;
    @NotEmpty
    private String name;
    @NotEmpty
    private String carBrand;
    @NotNull
    @Positive
    private Integer count;
    @NotNull
    @Positive
    private BigDecimal cost;

}
