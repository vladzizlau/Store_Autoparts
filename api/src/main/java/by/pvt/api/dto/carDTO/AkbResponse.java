package by.pvt.api.dto.carDTO;


import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;


@Data
@Builder

public class AkbResponse {
    private long id;
    private String manufacturer;
    private String name;
    private  int voltage;
    private double batteryCapacity;
    private int electricCurrent;
    private int length;
    private int width;
    private int height;
    private BigDecimal price;

}
