package by.pvt.api.dto.shopDTO;

import lombok.Builder;
import lombok.Data;

@Data

public class OrderResponse {
    private Long id;
    private Long userId;
    private Double cost;
    private String status;

}
