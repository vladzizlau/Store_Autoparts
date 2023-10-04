package by.pvt.api.dto.shopDTO;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class OrderResponse {
    private long id;
    private long productId;
    private long userId;
    private double cost;
    private int count;


}
