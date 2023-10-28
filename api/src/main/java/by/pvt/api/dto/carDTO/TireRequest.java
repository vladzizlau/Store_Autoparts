package by.pvt.api.dto.carDTO;


import lombok.Data;

import java.math.BigDecimal;

@Data
public class TireRequest {
    private long id;
    private String manufacturer;
    private String name;
    private double profileWidth;
    private double profileHeight;
    private int diametr;
    private String season;
    private BigDecimal price;


}
