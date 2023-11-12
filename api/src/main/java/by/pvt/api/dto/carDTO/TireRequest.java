package by.pvt.api.dto.carDTO;


import lombok.Data;

import java.math.BigDecimal;

@Data
public class TireRequest {
    private Long id;
    private String manufacturer;
    private String name;
    private Double profileWidth;
    private Double profileHeight;
    private Integer diametr;
    private String season;
    private BigDecimal price;


}
