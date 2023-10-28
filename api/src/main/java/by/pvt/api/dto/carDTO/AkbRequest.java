package by.pvt.api.dto.carDTO;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class AkbRequest {
    private long id;
    private String manufacturer;
    private String name;
    private int voltage;
    private double batteryCapacity;
    private int electricCurrent;
    private int length;
    private int width;
    private int height;
    private BigDecimal price;

}
