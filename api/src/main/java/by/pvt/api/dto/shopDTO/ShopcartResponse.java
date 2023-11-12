package by.pvt.api.dto.shopDTO;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
@Builder
public class ShopcartResponse {
    private Long id;
    private BigDecimal cost;
    private Integer count;
    private Long product;
}
