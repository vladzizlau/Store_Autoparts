package by.pvt.api.dto.shopDTO;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class OrderResponse {
    long id;
    long productid;
    long userid;
    double cost;
    int count;


}
