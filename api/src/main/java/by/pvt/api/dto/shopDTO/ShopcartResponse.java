package by.pvt.api.dto.shopDTO;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ShopcartResponse {
    long id;
    long orderid;
    String status;
    double cost;


}
