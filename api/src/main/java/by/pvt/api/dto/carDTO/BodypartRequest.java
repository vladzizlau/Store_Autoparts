package by.pvt.api.dto.carDTO;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Data

public class BodypartRequest {
    private long id;
    private String name;
    private String carBrand;
    private String carModel;
    private int count;
    private BigDecimal cost;

}
