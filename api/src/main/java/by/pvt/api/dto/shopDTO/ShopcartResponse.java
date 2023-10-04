package by.pvt.api.dto.shopDTO;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
@Builder
public class ShopcartResponse {
    private long id;
    private Long orderId;
    private String status;
    private BigDecimal cost;


}
