package by.pvt.api.dto.shopDTO;


import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data

public class ShopcartRequest {
    private long id;
    private Long orderId;
    private String status;
    private BigDecimal cost;
    private Integer count;


}
