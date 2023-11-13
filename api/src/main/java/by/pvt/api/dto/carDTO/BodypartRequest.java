package by.pvt.api.dto.carDTO;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;


import java.beans.Transient;
import java.math.BigDecimal;

@Data
public class BodypartRequest {
    private Long id;
    private String name;
    private String carBrand;
    private Integer count;
    private BigDecimal cost;

}
