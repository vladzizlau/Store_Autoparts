package by.pvt.api.dto.carDTO;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Builder
public class TireResponse {
    private Long id;
    private Long code;
    private String manufacturer;
    private String name;
    private Double profileWidth;
    private Double profileHeight;
    private Integer diametr;
    private String season;
    private BigDecimal price;

}
