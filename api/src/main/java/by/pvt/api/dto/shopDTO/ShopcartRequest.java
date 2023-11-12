package by.pvt.api.dto.shopDTO;


import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
public class ShopcartRequest {
    private BigDecimal cost;
    private Integer count;
    private Long product;
    private Long user;
}
