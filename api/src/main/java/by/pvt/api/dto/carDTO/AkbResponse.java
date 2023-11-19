package by.pvt.api.dto.carDTO;


import lombok.Builder;
import lombok.Data;

//import jakarta.persistence.Entity;
import java.math.BigDecimal;


@Data
@Builder

public class AkbResponse {
    private Long id;
    private Long code;
    private String manufacturer;
    private String name;
    private Integer voltage;
    private Double batteryCapacity;
    private Integer electricCurrent;
    private Integer length;
    private Integer width;
    private Integer height;
    private BigDecimal price;

}
