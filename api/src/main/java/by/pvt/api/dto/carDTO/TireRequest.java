package by.pvt.api.dto.carDTO;


import jakarta.validation.constraints.*;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class TireRequest {
    @NotNull
    @Positive
    @Size(min =5, max = 10)
    private Long code;
    @NotBlank
    private String manufacturer;
    @NotBlank
    private String name;
    @NotEmpty
    @Positive
    private Double profileWidth;
    @NotEmpty
    @Positive
    private Double profileHeight;
    @NotEmpty
    @Positive
    private Integer diametr;
    @NotBlank
    private String season;
    @NotEmpty
    @Positive
    private BigDecimal price;


}
